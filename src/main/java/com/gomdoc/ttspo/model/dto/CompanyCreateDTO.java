package com.gomdoc.ttspo.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

/**
 * description    :
 * packageName    : com.gomdoc.ttspo.model.dto
 * fileName       : CompanyCreateDTO
 * author         : cho
 * date           : 2025. 4. 22.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 4. 22.        cho       최초 생성
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CompanyCreateDTO {
    @NotNull(message = "301")
    @NotEmpty(message = "301")
    private String companyName;
}
