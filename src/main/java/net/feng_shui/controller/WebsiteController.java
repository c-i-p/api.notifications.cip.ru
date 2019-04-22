package net.feng_shui.controller;

import net.feng_shui.model.Website;
import net.feng_shui.controller.generic.GenericController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by mil on 27.11.15.
 */

@Controller
@RequestMapping("/website")
public class WebsiteController extends GenericController<Website> {

}
