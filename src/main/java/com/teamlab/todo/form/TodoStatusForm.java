package com.teamlab.todo.form;

/**
 * ステータスフォーム
 *
 * @author noda.
 */
public class TodoStatusForm {
    /**
     * ID
     */
    private Long todoId;

    /**
     * 完了フラグ
     */
    private boolean completionFlg;

    public TodoStatusForm() {
    }

    public Long getTodoId() {
        return todoId;
    }

    public void setTodoId(Long todoId) {
        this.todoId = todoId;
    }

    public boolean isCompletionFlg() {
        return completionFlg;
    }

    public void setCompletionFlg(boolean completionFlg) {
        this.completionFlg = completionFlg;
    }
}
