package com.gomdoc.ttspo.repository;

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
    List<SendInfoDto> searchByCriteria(String baseId, Integer minCount);
}
