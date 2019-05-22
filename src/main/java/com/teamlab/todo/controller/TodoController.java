package com.teamlab.todo.controller;

import com.teamlab.todo.entity.Todo;
import com.teamlab.todo.form.TodoForm;
import com.teamlab.todo.dto.TodoDto;
import com.teamlab.todo.form.TodoStatusForm;
import com.teamlab.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Todoコントローラ
 *
 * @author noda.
 */
@Controller
public class TodoController {

    @Autowired TodoService todoService;

    /**
     * トップ
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        List<Todo> todoList = todoService.findAll();
        List<TodoDto> todoDtoList = todoList.stream().map(TodoDto::new).collect(Collectors.toList());
        model.addAttribute("todoDtoList", todoDtoList);
        return "index";
    }

    /**
     * 編集
     */
    @GetMapping("/edit/{todoId}")
    public String edit(@PathVariable(name = "todoId", required = false) String todoId, Model model) {
        Optional<Todo> todoOptional = todoService.findById(Long.valueOf(todoId));
        if (todoOptional.isPresent()) {
            TodoDto todoDto = new TodoDto(todoOptional.get());
            model.addAttribute("todoDto", todoDto);
            return "edit";
        }
        return "redirect:/";
    }

    /**
     * 作成
     */
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String create(@ModelAttribute @Validated TodoForm todoForm, BindingResult result) {
        if (!result.hasErrors()) {
            todoService.create(todoForm);
        }
        return "redirect:/";
    }

    /**
     * 更新
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(@ModelAttribute @Validated TodoForm todoForm, BindingResult result) {
        if (!result.hasErrors()) {
            todoService.update(todoForm);
        }
        return "redirect:/";
    }

    /**
     * ステータス更新
     */
    @RequestMapping(value = "/update/status", method = RequestMethod.POST)
    public String updateStatus(@ModelAttribute TodoStatusForm todoStatusForm) {
        todoService.updateStatus(todoStatusForm);
        return "redirect:/";
    }

    /**
     * 検索
     */
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String search(Model model) {
        return "search";
    }
}
