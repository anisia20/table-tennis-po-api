package com.gomdoc.ttspo.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * description    :
 * packageName    : com.gomdoc.ttspo.model.dto
 * fileName       : UserCreateDTO
 * author         : cho
 * date           : 2025. 3. 14.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 3. 14.        cho       최초 생성
 */
@EqualsAndHashCode(callSuper = true)
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserUpdateDTO extends UserBaceDTO{
    @NotNull(message="204")
    private Long id;
}
