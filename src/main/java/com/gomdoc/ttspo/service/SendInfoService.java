package com.gomdoc.ttspo.service;

import com.gomdoc.ttspo.common.GomdocUtils;
import com.gomdoc.ttspo.common.constants.ResultCode;
import com.gomdoc.ttspo.config.ModelMapperConfig;
import com.gomdoc.ttspo.model.Result;
import com.gomdoc.ttspo.model.dto.SendInfoResponseDTO;
import com.gomdoc.ttspo.model.dto.SendInfoSearchDTO;
import com.gomdoc.ttspo.model.dto.UserResponseDTO;
import com.gomdoc.ttspo.model.entity.SendInfo;
import com.gomdoc.ttspo.repository.SendInfoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * description    :
 * packageName    : com.gomdoc.ttspo.service
 * fileName       : SendInfoService
 * author         : cho
 * date           : 2025. 4. 22.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 4. 22.        cho       최초 생성
 */
@Slf4j
@Service
public class SendInfoService {
    @Autowired
    private GomdocUtils util;

    @Autowired
    private SendInfoRepository sendInfoRepo;

    @Autowired
    private ModelMapperConfig modelMapper;

    public ResponseEntity<Result<List<SendInfoResponseDTO>>> search(SendInfoSearchDTO sendInfoSearchDTO) {
        Result<List<SendInfoResponseDTO>> result = util.isValid(sendInfoSearchDTO, new Result<>());
        if (!result.isEmpty()) {
            return ResponseEntity.badRequest().body(result);
        }
        List<SendInfoResponseDTO> data = sendInfoRepo.searchByCriteria(sendInfoSearchDTO.getBaseId(), 0);
        if(util.isNullOrEmpty(data)){
            result.setResultFail(ResultCode.R_406);
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(result);
        }

        List<SendInfoResponseDTO> responseDTOS = data.stream().map(user -> modelMapper.map(data, SendInfoResponseDTO.class))
                .toList();
        result.setSuccess(responseDTOS);
        return ResponseEntity.ok(result);
    }


}
