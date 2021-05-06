package com.inetum.realdolmen.careercorner.model;

import lombok.Value;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.Instant;

@Value
public class ErrorModel {
    @NotBlank
    String identifier;
    @NotNull
    Instant timestamp;
    @NotBlank
    String code;
    @NotBlank
    String message;
}
