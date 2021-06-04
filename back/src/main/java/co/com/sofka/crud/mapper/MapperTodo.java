package co.com.sofka.crud.mapper;

import co.com.sofka.crud.dto.TodoDto;
import co.com.sofka.crud.entity.Todo;
import org.mapstruct.Mapper;


import java.util.List;

@Mapper(componentModel = "spring")
public interface MapperTodo {

    TodoDto toModelDto(Todo todo);
    Todo toDtoModel(TodoDto todoDto);
    List<TodoDto> listTodoDto (List<Todo> todos);

}
