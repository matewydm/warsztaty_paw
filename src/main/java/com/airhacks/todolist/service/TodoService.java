package com.airhacks.todolist.service;

import com.airhacks.todolist.model.TodoItem;
import com.airhacks.todolist.repository.TodoItemRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@Stateless
public class TodoService {

    @Inject
    private TodoItemRepository todoItemRepository;

    public void addItem(String item) {
        todoItemRepository.save(new TodoItem(item));
    }

    public List<TodoItem> findAllItems(){
        return todoItemRepository.findAll();
    }

    public List<String> getItems(){
        return todoItemRepository.findAll().stream().map(TodoItem::getItem).collect(Collectors.toList());
    }

}
