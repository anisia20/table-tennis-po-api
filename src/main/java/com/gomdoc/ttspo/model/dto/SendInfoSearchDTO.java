package com.gomdoc.ttspo.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * description    :
 * packageName    : com.gomdoc.ttspo.model.dto
 * fileName       : SendInfoSearchDTO
 * author         : cho
 * date           : 2025. 4. 22.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 4. 22.        cho       최초 생성
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SendInfoSearchDTO {
    @NotNull(message = "402")
    @NotEmpty(message = "402")
    private String baseId;
}
