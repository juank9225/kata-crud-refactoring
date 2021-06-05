package co.com.sofka.crud.dto;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class TodoDto {

    private Long id;

    @NotBlank(message="El nombre no puede estar vacío")
    @Pattern(regexp = "[A-Za-z]+",message = "El nombre solo puede contener letras")
    private String name;

    @NotNull(message ="el campo completado no puede ser vacio")
    private boolean completed;

    @NotNull(message ="el grupo no puede ser vacio")
    @Min(value = 1, message ="El id del grupo debe ser mayor que 0 y no puedes contener letras" )
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
