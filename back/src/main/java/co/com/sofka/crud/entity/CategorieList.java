package co.com.sofka.crud.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="Categorie")
public class CategorieList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "categoria")
    private Set<Todo> todo;


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

    public Set<Todo> getTodo() {
        return todo;
    }

    public void setTodo(Set<Todo> todo) {
        this.todo = todo;
    }


}
