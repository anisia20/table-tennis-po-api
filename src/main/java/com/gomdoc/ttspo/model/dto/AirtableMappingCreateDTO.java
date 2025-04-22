package com.gomdoc.ttspo.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * description    :
 * packageName    : com.gomdoc.ttspo.model.dto
 * fileName       : AirtableMappingCreateDTO
 * author         : cho
 * date           : 2025. 4. 22.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 4. 22.        cho       최초 생성
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AirtableMappingCreateDTO {
    @NotNull(message = "601")
    @NotEmpty(message = "601")
    private String baseId;

    @NotNull(message = "602")
    @NotEmpty(message = "602")
    private String tableId;

    @NotNull(message = "603")
    @NotEmpty(message = "603")
    private String recordId;

    @NotNull(message = "604")
    @NotEmpty(message = "604")
    private String keyInfo;

    @NotNull(message = "605")
    @NotEmpty(message = "605")
    private String useYn;
}
