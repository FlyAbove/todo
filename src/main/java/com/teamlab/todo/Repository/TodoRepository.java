package com.teamlab.todo.Repository;

import com.teamlab.todo.Entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Todoリポジトリ
 *
 * @author noda.
 */
@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
}