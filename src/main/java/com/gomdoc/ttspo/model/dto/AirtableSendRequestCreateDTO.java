package com.gomdoc.ttspo.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * description    :
 * packageName    : com.gomdoc.ttspo.model.dto
 * fileName       : AirtableSendRequestCreateDTO
 * author         : cho
 * date           : 2025. 4. 22.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 4. 22.        cho       최초 생성
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AirtableSendRequestCreateDTO {
    @NotNull(message = "501")
    @NotEmpty(message = "501")
    private String keyInfo;

    @NotNull(message = "502")
    private Integer status;

    @NotNull(message = "503")
    @NotEmpty(message = "503")
    private String dataJson;
}
