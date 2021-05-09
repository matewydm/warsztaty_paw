package com.airhacks.todolist.rest;

import com.airhacks.todolist.rest.dto.ToDoItemRequest;
import com.airhacks.todolist.rest.dto.ToDoItemResponse;
import com.airhacks.todolist.service.TodoService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("todo")
@Produces("application/json")
@Consumes("application/json")
public class ToDoResource {

    @Inject
    private TodoService todoService;

    @GET
    public Response getAll() {
        ToDoItemResponse response = new ToDoItemResponse();
        response.setTodos(todoService.getItems());
        return Response.ok(response).build();
    }

    @POST
    public void addItem(ToDoItemRequest request) {
        todoService.addItem(request.getItem());
    }
}
