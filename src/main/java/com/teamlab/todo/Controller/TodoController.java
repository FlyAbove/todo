package com.teamlab.todo.Controller;

import com.teamlab.todo.Entity.Todo;
import com.teamlab.todo.Repository.TodoRepository;
import com.teamlab.todo.dto.TodoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Todoコントローラ
 *
 * @author noda.
 */
@Controller
public class TodoController {

    @Autowired TodoRepository todoRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model mav) {
        List<Todo> todoList = todoRepository.findAll();
        List<TodoDto> todoDtoList = todoList.stream().map(TodoDto::new).collect(Collectors.toList());
        mav.addAttribute("todoDtoList", todoDtoList);
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
