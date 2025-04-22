package com.gomdoc.ttspo.service;

import com.gomdoc.ttspo.common.GomdocUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public List<SendInfoDto> search(String baseId, Integer minCount) {
        // 비즈니스 단위로 필요한 전/후 처리만 Service에서!
        return sendInfoRepo.searchByCriteria(baseId, minCount);
    }


}
