package com.teamlab.todo.form;

/**
 * 編集フォーム
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
    private String name;

    /**
     * 期日
     */
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
