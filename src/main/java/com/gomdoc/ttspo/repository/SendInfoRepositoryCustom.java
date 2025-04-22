package com.gomdoc.ttspo.repository;

import com.gomdoc.ttspo.model.dto.SendInfoResponseDTO;
import com.gomdoc.ttspo.model.entity.SendInfo;

import java.util.List;

/**
 * description    :
 * packageName    : com.gomdoc.ttspo.repository
 * fileName       : SendInfoRepositoryCustom
 * author         : cho
 * date           : 2025. 4. 20.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 4. 20.        cho       최초 생성
 */
public interface SendInfoRepositoryCustom {
    List<SendInfoResponseDTO> searchByCriteria(String baseId, Integer minCount);
}
