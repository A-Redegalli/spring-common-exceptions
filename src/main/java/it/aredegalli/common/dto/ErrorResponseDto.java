package it.aredegalli.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorResponseDto {
    private String code;
    private String message;

    public static ErrorResponseDto of(String code, String message) {
        return new ErrorResponseDto(code, message);
    }
}
