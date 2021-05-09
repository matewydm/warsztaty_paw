package com.airhacks.todolist.rest.dto;

import java.util.List;

public class ToDoItemResponse {

    private List<String> todos;

    public List<String> getTodos() {
        return todos;
    }

    public void setTodos(List<String> todos) {
        this.todos = todos;
    }
}
