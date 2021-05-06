package com.inetum.realdolmen.careercorner.model;

import lombok.Value;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Value
public class EditUserSettingModel {
    @NotBlank
    String key;
    List<String> values;
}
