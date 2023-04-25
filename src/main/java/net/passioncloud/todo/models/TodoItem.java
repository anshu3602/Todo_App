package net.passioncloud.todo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

/*@Entity
public class TodoItem {
    @Id
    @GeneratedValue
    private Long id;

    @NotBlank
    private String title;

    private boolean completed;
    private long timeSpent;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
    public Long gettimeSpent() {
        return timeSpent;
    }

    public void settimeSpent(Long id) {
        this.timeSpent = timeSpent;
    }
}*/

@Entity
public class TodoItem {
    @Id
    @GeneratedValue
    private Long id;

    @NotBlank
    private String title;

    private boolean completed;
    private long timeSpent;

public static class Builder {
    private String title;

    private boolean completed;
    private long timeSpent;
    public Builder(String title) {
        this.title = title;
        }

    public Builder setCompleted(boolean completed) {
        this.completed = completed;
        return this;
        }

    public Builder setTimeSpent(long timeSpent) {
        this.timeSpent = timeSpent;
        return this;
        }

    public TodoItem build() {
        TodoItem item = new TodoItem();
        item.setTitle(this.title);
        item.setCompleted(this.completed);
        //item.setTimeSpent(this.timeSpent);
        return item;
        }
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
    public Long gettimeSpent() {
        return timeSpent;
    }

    public void settimeSpent(Long id) {
        this.timeSpent = timeSpent;
    }
}
