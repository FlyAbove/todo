package com.teamlab.todo.repository;

import com.teamlab.todo.entity.Todo;
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