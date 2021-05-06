package com.inetum.realdolmen.careercorner.model;

import lombok.Value;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Value
public class UserSettingModel {
    @NotBlank
    String key;
    @NotBlank
    String dataType;
    List<String> values;
}
