package co.com.sofka.crud.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class CategorieListDto {

    private Long id;

    @NotBlank(message="El nombre de la categoria no puede estar vacío")
    @Pattern(regexp = "[A-Za-z]+",message = "El nombre solo puede contener letras")
    private String name;

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
}
