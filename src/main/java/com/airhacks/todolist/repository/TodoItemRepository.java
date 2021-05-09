package com.airhacks.todolist.repository;

import com.airhacks.todolist.model.TodoItem;

import javax.ejb.Singleton;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class TodoItemRepository {

    private List<TodoItem> items = new ArrayList<>();

    public List<TodoItem> findAll() {
        return items;
    }

    public void save(TodoItem item){
        items.add(item);
    }
}
