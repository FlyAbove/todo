package com.teamlab.todo.service;

import com.teamlab.todo.entity.Todo;
import com.teamlab.todo.form.EditForm;
import com.teamlab.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Todoサービス
 *
 * @author noda.
 */
@Service
public class TodoService {

    @Autowired TodoRepository todoRepository;

    /**
     * 全件取得
     * @return List
     */
    public List<Todo> findAll() {
        return todoRepository.findAll();
    }

    /**
     * IDから取得
     * @param todoId ID
     * @return Optional
     */
    public Optional<Todo> findById(Long todoId) {
        return todoRepository.findById(todoId);
    }

    /**
     * 更新
     * @param editForm フォーム
     */
    public void update(EditForm editForm) {
        Optional<Todo> todoOptional = todoRepository.findById(editForm.getTodoId());
        if (todoOptional.isPresent()) {
            Todo todo = todoOptional.get();
            todo.setName(editForm.getName());
            todo.setDeadline(editForm.getDeadline());
            todoRepository.save(todo);
        }
    }
}
