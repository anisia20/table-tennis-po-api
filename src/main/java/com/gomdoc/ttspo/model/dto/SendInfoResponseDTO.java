package com.gomdoc.ttspo.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * description    :
 * packageName    : com.gomdoc.ttspo.model.dto
 * fileName       : SendInfoResponseDTO
 * author         : cho
 * date           : 2025. 4. 22.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 4. 22.        cho       최초 생성
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SendInfoResponseDTO {
    private Long sendInfoSeq;
    private Long userSeq;
    private String baseId;
    private Integer sendCount;
    private Integer limitCount;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
}
