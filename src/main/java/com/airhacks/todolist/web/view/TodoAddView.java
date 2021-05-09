package com.airhacks.todolist.web.view;

import com.airhacks.todolist.service.TodoService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@RequestScoped
@Named
public class TodoAddView implements Serializable {

    @Inject
    private TodoService todoService;

    private String todoItem = "";

    public String submit(){
        todoService.addItem(todoItem);
        return "todo-list";
    }

    public String getTodoItem() {
        return todoItem;
    }

    public void setTodoItem(String todoItem) {
        this.todoItem = todoItem;
    }
}
