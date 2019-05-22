package com.teamlab.todo.form;

import javax.validation.constraints.NotEmpty;

/**
 * Todoフォーム
 *
 * @author noda.
 */
public class TodoForm {
    /**
     * ID
     */
    private Long todoId;

    /**
     * 名前
     */
    @NotEmpty
    private String name;

    /**
     * 期日
     */
    @NotEmpty
    private String deadline;

    public TodoForm() {
    }

    public Long getTodoId() {
        return todoId;
    }

    public void setTodoId(Long todoId) {
        this.todoId = todoId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }
}
