package com.inetum.realdolmen.careercorner.model;

import lombok.Value;

import javax.validation.constraints.NotBlank;

@Value
public class EditNotificationModel {
    @NotBlank
    String id;
    boolean read;
}
