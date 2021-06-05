package co.com.sofka.crud.controller;

import co.com.sofka.crud.entity.CategorieList;
import co.com.sofka.crud.service.CategorieListService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class CategorieController {

    @Autowired
    private CategorieListService categorieListService;

    @GetMapping(value = "api/categorias")
    public Iterable<CategorieList> list(){
        return categorieListService.list();
    }

    @PostMapping(value = "api/categoria")
    public CategorieList save(@Valid @RequestBody CategorieList categorieList){
        return categorieListService.save(categorieList);
    }

    @DeleteMapping(value = "api/{id}/categoria")
    public void delete(@PathVariable("id")Long id){
        categorieListService.delete(id);
    }

    @GetMapping(value = "api/{id}/categoria")
    public CategorieList get(@PathVariable("id") Long id){
        return categorieListService.get(id);
    }

}
