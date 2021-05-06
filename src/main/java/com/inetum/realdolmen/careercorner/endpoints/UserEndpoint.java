package com.inetum.realdolmen.careercorner.endpoints;

import com.inetum.realdolmen.careercorner.model.*;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserEndpoint {


    @Operation(summary = "Retrieves the objectives for the current user based on the provided Bearer token.")
    @GetMapping(value = "/me/objectives")
    public List<ObjectiveModel> getMyObjectives() {
        return new ArrayList<>();
    }

    @Operation(summary = "Retrieves some user information like firstname, givenName based on the provided token.")
    @GetMapping(value = "/me")
    public UserModel getMe() {
        return null;
    }

    @Operation(summary = "Retrieves some user information for the user with provided id.")
    @GetMapping(value = "/{userId}")
    public UserModel getUserInfo(@PathVariable String userId) {
        return null;
    }

    @Operation(summary = "Retrieves the objectives of the provided user. The user must be authorized to view this resource or a 403 will be returned.")
    @GetMapping(value = "/{userId}/objectives")
    public List<ObjectiveModel> getUserObjective(@PathVariable String userId) {
        return null;
    }

    @Operation(summary = "Creates a new objective. The objective must be created by either its owner or his/her direct manager or a 403 will be returned.")
    @PostMapping(value = "/{userId}/objectives")
    public ObjectiveModel createObjective(@PathVariable String userId, EditObjectiveModel model) {
        return null;
    }

    @Operation(summary = "Retrieves the objectives of the users directly reporting to the authorized user.")
    @GetMapping(value = "/direct-reports/objectives")
    public List<ObjectiveModel> getDirectReportsObjectives() {
        return new ArrayList<>();
    }

    @Operation(summary = "Retrieves the configured settings for the current user based on the provided Bearer token.")
    @GetMapping(value = "/me/settings")
    public List<UserSettingModel> getMySettings() {
        return new ArrayList<>();
    }

    @Operation(summary = "Updates the provided settings for the current user based on the provided Bearer token. Values must comply with corresponding SettingDefinition.")
    @PutMapping(value = "/me/settings")
    public List<UserSettingModel> updateMySettings(List<EditUserSettingModel> settings) {
        return new ArrayList<>();
    }

    @Operation(summary = "Retrieves the notifications for the current used based on the provided Bearer token.")
    @GetMapping(value = "/me/notifications")
    public List<NotificationModel> getMyNotifications() {
        return new ArrayList<>();
    }
}
