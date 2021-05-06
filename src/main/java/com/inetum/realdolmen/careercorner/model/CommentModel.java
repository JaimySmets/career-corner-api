package com.inetum.realdolmen.careercorner.model;

import lombok.Value;

import javax.validation.constraints.NotBlank;
import java.time.Instant;

@Value
public class CommentModel {
    @NotBlank
    String id;
    Instant postDate;
    String comment;
    UserModel postedBy;
}
