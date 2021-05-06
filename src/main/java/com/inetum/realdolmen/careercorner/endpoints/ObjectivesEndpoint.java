package com.inetum.realdolmen.careercorner.endpoints;

import com.inetum.realdolmen.careercorner.model.EditObjectiveModel;
import com.inetum.realdolmen.careercorner.model.ObjectiveModel;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/objectives")
public class ObjectivesEndpoint {

    @Operation(summary = "Updates an existing objective. The objective must be created by either its owner or his/her direct manager or a 403 will be returned.")
    @PutMapping(value = "/{objectiveId}")
    public ObjectiveModel updateObjective(@PathVariable String objectiveId, EditObjectiveModel model) {
        return null;
    }

    @Operation(summary = "Retrieves the objective with the specified ID. The user must have access to this resource or a 403 will be returned.")
    @GetMapping(value = "/{objectiveId}")
    public List<ObjectiveModel> getObjective(@PathVariable String objectiveId) {
        return new ArrayList<>();
    }

}
