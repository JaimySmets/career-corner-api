package com.inetum.realdolmen.careercorner.endpoints;

import com.inetum.realdolmen.careercorner.model.EditNotificationModel;
import com.inetum.realdolmen.careercorner.model.NotificationModel;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/notifications")
public class NotificationsEndpoint {

    @Operation(summary = "Updates the provided notifications, if they are linked to the authorized user. Returns the updated notifications.")
    @PostMapping
    public List<NotificationModel> updateNotifications(List<EditNotificationModel> editNotificationModels) {
        return null;
    }
}
