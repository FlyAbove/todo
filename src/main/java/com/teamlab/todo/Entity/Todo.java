package com.teamlab.todo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * ToDoテーブル
 *
 * @author noda.
 */
@Entity
@Table(name = "todo")
public class Todo {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long todoId;

    /**
     * 名前
     */
    private String name;

    /**
     * 期日
     */
    private Date deadline;

    /**
     * 完了フラグ
     */
    private boolean completionFlg;

    /**
     * 作成日
     */
    private Date createAt;

    /**
     * 更新日
     */
    private Date updateAt;

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

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public boolean isCompletionFlg() {
        return completionFlg;
    }

    public void setCompletionFlg(boolean completionFlg) {
        this.completionFlg = completionFlg;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
}
