package com.inetum.realdolmen.careercorner.model;

import lombok.Value;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Value
public class SettingDefinitionModel {
    @NotBlank
    String key;
    @NotBlank
    String dataType;
    List<I18nDescriptionModel> descriptions;
    List<String> constrainedValues;
    List<String> defaultValues;
}
