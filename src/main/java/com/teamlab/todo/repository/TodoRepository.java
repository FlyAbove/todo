package com.teamlab.todo.repository;

import com.teamlab.todo.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Todoリポジトリ
 *
 * @author noda.
 */
@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
    // name部分一致検索
    List<Todo> findByNameContaining(String str);
}