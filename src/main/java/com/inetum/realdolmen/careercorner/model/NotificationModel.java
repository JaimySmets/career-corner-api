package com.inetum.realdolmen.careercorner.model;

import lombok.Value;

import javax.validation.constraints.NotNull;

@Value
public class NotificationModel {
    @NotNull
    UserModel recipient;
    @NotNull
    boolean read;
    @NotNull
    String message;
    String hyperlink;
}
