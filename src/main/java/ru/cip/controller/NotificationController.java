package ru.cip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.cip.model.Notification;
import ru.cip.controller.generic.GenericController;

/**
 * Created by milomory on 22.04.19.
 */

@Controller
@RequestMapping("/notification")
public class NotificationController extends GenericController<Notification> {

}
