package com.gomdoc.ttspo.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
/**
 * description    :
 * packageName    : com.gomdoc.ttspo.model.dto
 * fileName       : AirtableFieldInfoCreateDTO
 * author         : cho
 * date           : 2025. 4. 22.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 4. 22.        cho       최초 생성
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AirtableFieldInfoCreateDTO {
    @NotNull(message = "701")
    @NotEmpty(message = "701")
    private String baseId;

    @NotNull(message = "702")
    @NotEmpty(message = "702")
    private String tableId;

    @NotNull(message = "703")
    @NotEmpty(message = "703")
    private String fieldName;

    @NotNull(message = "704")
    @NotEmpty(message = "704")
    private String isKey;

    @NotNull(message = "705")
    @NotEmpty(message = "705")
    private String useYn;
}
