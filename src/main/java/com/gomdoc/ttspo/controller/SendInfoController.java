package com.gomdoc.ttspo.controller;

import com.gomdoc.ttspo.model.Result;
import com.gomdoc.ttspo.model.dto.UserCreateDTO;
import com.gomdoc.ttspo.model.dto.UserResponseDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * description    :
 * packageName    : com.gomdoc.ttspo.controller
 * fileName       : SendInfoController
 * author         : cho
 * date           : 2025. 4. 22.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 4. 22.        cho       최초 생성
 */
@Slf4j
@RestController
@RequestMapping("/api/sendinfo")
public class SendInfoController {
    @Operation(summary = "사용자 조회", description = "사용자를 조회합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공", content = @Content(schema = @Schema(implementation = UserCreateDTO.class))),
            @ApiResponse(responseCode = "404", description = "사용자를 찾을 수 없음")
    })
    @GetMapping
    public ResponseEntity<Result<List<UserResponseDTO>>> loadAll() {
        return userService.findAll();
    }

}
