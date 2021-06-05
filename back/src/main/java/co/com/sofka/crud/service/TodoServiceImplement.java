package co.com.sofka.crud.service;

import co.com.sofka.crud.dao.TodoService;
import co.com.sofka.crud.dto.TodoDto;
import co.com.sofka.crud.entity.Todo;
import co.com.sofka.crud.mapper.MapperTodo;
import co.com.sofka.crud.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImplement implements TodoService {

    @Autowired
    private TodoRepository repository;
    @Autowired
    private MapperTodo mapperTodo;

    @Override
    public Iterable<TodoDto> list(){
        return mapperTodo.listTodoDto(
                (List<Todo>) repository.findAll());
    }

    @Override
    public TodoDto save(TodoDto todoDto){
        Todo todo = mapperTodo.toDtoModel(todoDto);
        return mapperTodo.toModelDto(repository.save(todo));
    }

    @Override
    public void delete(Long id){
        repository.delete(mapperTodo.toDtoModel(get(id)));
    }

    @Override
    public TodoDto get(Long id){
        Todo todo = repository.findById(id).orElseThrow();
        return mapperTodo.toModelDto(todo);
    }

}
