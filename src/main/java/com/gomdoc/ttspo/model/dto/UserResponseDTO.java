package com.gomdoc.ttspo.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * description    :
 * packageName    : com.gomdoc.ttspo.model.dto
 * fileName       : UserResponseDTO
 * author         : cho
 * date           : 2025. 3. 14.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 3. 14.        cho       최초 생성
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserResponseDTO extends UserBaceDTO {
    private Long id;
}
