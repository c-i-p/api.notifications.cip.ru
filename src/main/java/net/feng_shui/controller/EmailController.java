package net.feng_shui.controller;

import net.feng_shui.model.Email;
import net.feng_shui.controller.generic.GenericController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by mil on 27.11.15.
 */

@Controller
@RequestMapping("/email")
public class EmailController extends GenericController<Email> {

}
