package com.inetum.realdolmen.careercorner.model;

import lombok.Value;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.Instant;

@Value
public class EditObjectiveModel {
    @Size(max = 50)
    String objective;
    Instant deadline;
    @Size(max = 2000)
    String remarks;
    @NotBlank
    String status;
}
