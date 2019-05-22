package com.teamlab.todo.dto;

import com.teamlab.todo.entity.Todo;
import com.teamlab.todo.utils.DateUtils;

/**
 * TodoDto
 *
 * @author noda.
 */
public class TodoDto {
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

    /**
     * 完了フラグ
     */
    private boolean completionFlg;

    /**
     * 作成日
     */
    private String createAt;

    /**
     * 更新日
     */
    private String updateAt;

    public TodoDto(Todo todo) {
        this.todoId = todo.getTodoId();
        this.name = todo.getName();
        this.deadline = todo.getDeadline();
        this.completionFlg = todo.isCompletionFlg();
        this.createAt = DateUtils.dateToString(todo.getCreateAt());
        this.updateAt = DateUtils.dateToString(todo.getUpdateAt());
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

    public boolean isCompletionFlg() {
        return completionFlg;
    }

    public void setCompletionFlg(boolean completionFlg) {
        this.completionFlg = completionFlg;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }
}
