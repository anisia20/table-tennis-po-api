package com.gomdoc.ttspo.repository;

import com.gomdoc.ttspo.model.entity.AirtableMapping;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * description    :
 * packageName    : com.gomdoc.ttspo.repository
 * fileName       : AirtableMappingRepository
 * author         : cho
 * date           : 2025. 4. 20.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 4. 20.        cho       최초 생성
 */
public interface AirtableMappingRepository extends JpaRepository<AirtableMapping, Long> {}
