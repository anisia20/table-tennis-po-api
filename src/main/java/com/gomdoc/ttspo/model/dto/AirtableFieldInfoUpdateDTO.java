package com.gomdoc.ttspo.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * description    :
 * packageName    : com.gomdoc.ttspo.model.dto
 * fileName       : AirtableFieldInfoUpdateDTO
 * author         : cho
 * date           : 2025. 4. 22.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 4. 22.        cho       최초 생성
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AirtableFieldInfoUpdateDTO extends AirtableFieldInfoCreateDTO {
    @NotNull(message = "706")
    private Long fieldInfoSeq;
}
