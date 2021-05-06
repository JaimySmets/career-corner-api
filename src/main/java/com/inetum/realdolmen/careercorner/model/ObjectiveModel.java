package com.inetum.realdolmen.careercorner.model;

import lombok.Value;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.Instant;
import java.util.List;

@Value
public class ObjectiveModel {
    @NotBlank
    String id;
    @Size(max = 50)
    String objective;
    Instant deadline;
    @Size(max = 2000)
    String remarks;
    @NotBlank
    String status;

    @NotBlank
    UserModel employee;
    @NotBlank
    UserModel createdBy;

    List<CommentModel> comments;
}
