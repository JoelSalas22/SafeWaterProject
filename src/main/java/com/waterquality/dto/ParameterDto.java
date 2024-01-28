package com.waterquality.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.waterquality.entity.Parameter}
 */
@Value
public class ParameterDto implements Serializable {
    @NotNull
    String parameterName;
}