package co.com.sofka.crud.service;

import co.com.sofka.crud.dto.TodoDto;
import co.com.sofka.crud.entity.Todo;

public interface TodoService {

    Iterable<TodoDto> list();

    TodoDto save(TodoDto todoDto);

    void delete(Long id);

    TodoDto get(Long id);
}
