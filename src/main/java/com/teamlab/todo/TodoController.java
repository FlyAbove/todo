package com.teamlab.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Todoコントローラ
 *
 * @author noda.
 */
@Controller
public class TodoController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("message", "Hello Springboot");
        return "index";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public String edit(Model model) {
        return "edit";
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String search(Model model) {
        return "search";
    }
}
