package com.myProjectPlus.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class HealthCheckDto {
    private boolean status;
    private String message;

}
