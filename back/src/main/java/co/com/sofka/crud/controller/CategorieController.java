package co.com.sofka.crud.controller;

import co.com.sofka.crud.dto.CategorieListDto;
import co.com.sofka.crud.service.CategorieListService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class CategorieController {

    @Autowired
    private CategorieListService categorieListService;

    @GetMapping(value = "api/categorias")
    public Iterable<CategorieListDto> list(){
        return categorieListService.list();
    }

    @PostMapping(value = "api/categoria")
    public CategorieListDto save(@RequestBody CategorieListDto categorieListDao){
        return categorieListService.save(categorieListDao);
    }

    @DeleteMapping(value = "api/{id}/categoria")
    public void delete(@PathVariable("id")Long id){
        categorieListService.delete(id);
    }

    @GetMapping(value = "api/{id}/categoria")
    public CategorieListDto get(@PathVariable("id") Long id){
        return categorieListService.get(id);
    }

}
