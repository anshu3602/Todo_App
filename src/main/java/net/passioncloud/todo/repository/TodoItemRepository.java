/*package net.passioncloud.todo.repository;

import net.passioncloud.todo.models.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import javax.persistence.Query;


import java.util.List;

public interface TodoItemRepository extends JpaRepository<TodoItem, Long> {
    int countAllByCompleted(boolean completed);
    List<TodoItem> findAllByCompleted(boolean completed);
    boolean existsTodoItemByCompleted(boolean completed);
    @Query("SELECT COALESCE(SUM(ti.timeSpent), 0) FROM TodoItem ti")
    Long sumtimeSpent();
    
}*/


package net.passioncloud.todo.repository;

import net.passioncloud.todo.models.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TodoItemRepository extends JpaRepository<TodoItem, Long> {
    int countAllByCompleted(boolean completed);
    List<TodoItem> findAllByCompleted(boolean completed);
    boolean existsTodoItemByCompleted(boolean completed);
    @Query("SELECT COALESCE(SUM(ti.timeSpent), 0) FROM TodoItem ti")
    Long sumtimeSpent();
}
