package com.gomdoc.ttspo.controller;

import com.gomdoc.ttspo.model.Result;
import com.gomdoc.ttspo.model.dto.SendInfoResponseDTO;
import com.gomdoc.ttspo.model.dto.SendInfoSearchDTO;
import com.gomdoc.ttspo.model.dto.UserCreateDTO;
import com.gomdoc.ttspo.model.dto.UserResponseDTO;
import com.gomdoc.ttspo.service.SendInfoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * description    :
 * packageName    : com.gomdoc.ttspo.controller
 * fileName       : SendInfoController
 * author         : cho
 * date           : 2025. 4. 22.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 4. 22.        cho       최초 생성
 */
@Slf4j
@RestController
@RequestMapping("/api/sendinfo")
public class SendInfoController {

    @Autowired
    private SendInfoService sendInfoService;

    @Operation(summary = "발송정보 조회", description = "발송정보를 조회합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공", content = @Content(schema = @Schema(implementation = SendInfoResponseDTO.class))),
            @ApiResponse(responseCode = "404", description = "발송정보를 찾을 수 없음")
    })
    @PostMapping
    public ResponseEntity<Result<List<SendInfoResponseDTO>>> search(@RequestBody SendInfoSearchDTO sendInfoSearchDTO) {
        return sendInfoService.search(sendInfoSearchDTO);
    }

}
