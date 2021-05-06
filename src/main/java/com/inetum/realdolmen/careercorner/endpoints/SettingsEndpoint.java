package com.inetum.realdolmen.careercorner.endpoints;

import com.inetum.realdolmen.careercorner.model.SettingDefinitionModel;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/settings")
public class SettingsEndpoint {

    @Operation(summary = "Returns defined settings available in the application.")
    @GetMapping
    public List<SettingDefinitionModel> getSettingDefinitions() {
        return new ArrayList<>();
    }

    @Operation(summary = "Creates a new usable setting in the application.")
    @PostMapping
    public SettingDefinitionModel createSettingDefinition(SettingDefinitionModel settingDefinition) {
        return null;
    }

    @Operation(summary = "Returns a specific setting definition available in the application.")
    @GetMapping(value = "/{settingKey}")
    public SettingDefinitionModel getSettingDefinition(@PathVariable String settingKey) {
        return null;
    }

}
