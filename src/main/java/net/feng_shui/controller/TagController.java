package net.feng_shui.controller;

import net.feng_shui.model.Tag;
import net.feng_shui.controller.generic.GenericController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mil on 02.12.15.
 */

@Controller
@RequestMapping("/tag")
public class TagController extends GenericController<Tag> {

}
