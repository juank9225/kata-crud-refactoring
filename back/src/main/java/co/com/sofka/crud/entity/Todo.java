package co.com.sofka.crud.entity;

import org.intellij.lang.annotations.Pattern;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="todo")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NotNull(message="El nombre de la tarea es obligatoria")
    private String name;

    @Column
    private boolean completed;

    @Column
    @NotNull(message="El grupo de la categoria es obligatoria")
    private Long categoria;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public Long getCategoria() {
        return categoria;
    }

    public void setCategoria(Long categoria) {
        this.categoria = categoria;
    }
}
