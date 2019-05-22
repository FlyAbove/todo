package com.teamlab.todo.service;

import com.teamlab.todo.entity.Todo;
import com.teamlab.todo.form.TodoForm;
import com.teamlab.todo.form.TodoStatusForm;
import com.teamlab.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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
     * 登録
     * @param todoForm フォーム
     */
    public void create(TodoForm todoForm) {
        Todo todo = new Todo();
        Date now = new Date();
        todo.setName(todoForm.getName());
        todo.setDeadline(todoForm.getDeadline());
        todo.setCreateAt(now);
        todo.setUpdateAt(now);
        todoRepository.save(todo);
    }

    /**
     * 更新
     * @param todoForm フォーム
     */
    public void update(TodoForm todoForm) {
        Optional<Todo> todoOptional = todoRepository.findById(todoForm.getTodoId());
        if (todoOptional.isPresent()) {
            Todo todo = todoOptional.get();
            todo.setName(todoForm.getName());
            todo.setDeadline(todoForm.getDeadline());
            todo.setUpdateAt(new Date());
            todoRepository.save(todo);
        }
    }

    /**
     * ステータス更新
     * @param todoStatusForm ステータスフォーム
     */
    public void updateStatus(TodoStatusForm todoStatusForm) {
        Optional<Todo> todoOptional = todoRepository.findById(todoStatusForm.getTodoId());
        if (todoOptional.isPresent()) {
            Todo todo = todoOptional.get();
            todo.setCompletionFlg(!todoStatusForm.isCompletionFlg());
            todo.setUpdateAt(new Date());
            todoRepository.save(todo);
        }
    }
}
