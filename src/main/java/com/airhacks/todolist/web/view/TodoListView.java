package com.airhacks.todolist.web.view;

import com.airhacks.todolist.model.TodoItem;
import com.airhacks.todolist.service.TodoService;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@ViewScoped
@Named
public class TodoListView implements Serializable {

    @Inject
    private TodoService todoService;

    private List<TodoItem> todoItems;

    @PostConstruct
    private void init() {
        todoItems = todoService.findAllItems();
    }

    public List<TodoItem> getTodoItems() {
        return todoItems;
    }
}
