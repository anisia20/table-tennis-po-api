package com.gomdoc.ttspo.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * description    :
 * packageName    : com.gomdoc.ttspo.model.dto
 * fileName       : AirtableSendRequestResponseDTO
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
public class AirtableSendRequestResponseDTO {
    private Long requestSeq;
    private String keyInfo;
    private Integer status;
    private String dataJson;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
}
