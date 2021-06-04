package co.com.sofka.crud.controller;



import co.com.sofka.crud.dao.CategorieListDao;
import co.com.sofka.crud.dto.CategorieListDto;
import co.com.sofka.crud.entity.CategorieList;
import co.com.sofka.crud.service.CategorieListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class CategorieController {

    @Autowired
    private CategorieListService categorieListService;

    @PostMapping(value = "api/categoria")
    public CategorieListDto save(@RequestBody CategorieListDto categorieListDao){
        return categorieListService.save(categorieListDao);
    }

}
