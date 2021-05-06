package com.inetum.realdolmen.careercorner.model;

import lombok.Value;

import javax.validation.constraints.NotBlank;

@Value
public class UserModel {
    @NotBlank
    String id;
    String givenName;
    String surname;
    @NotBlank
    String userPrincipalName;
}
