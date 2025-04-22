package com.gomdoc.ttspo.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * description    :
 * packageName    : com.gomdoc.ttspo.model.dto
 * fileName       : SendInfoCreateDTO
 * author         : cho
 * date           : 2025. 4. 22.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 4. 22.        cho       최초 생성
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SendInfoCreateDTO {
    @NotNull(message = "401")
    private Long userSeq;

    @NotNull(message = "402")
    @NotEmpty(message = "402")
    private String baseId;

    @NotNull(message = "403")
    @Min(value = 0, message = "403")
    private Integer sendCount;

    @NotNull(message = "404")
    @Min(value = 0, message = "404")
    private Integer limitCount;
}
