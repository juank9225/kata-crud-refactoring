package co.com.sofka.crud.dao;


import co.com.sofka.crud.dto.CategorieListDto;
import co.com.sofka.crud.entity.CategorieList;

public interface CategorieListDao {

    Iterable<CategorieListDto> list();

    CategorieListDto save(CategorieListDto categorieListDto);

    void delete(Long id);

    CategorieList get(Long id);
}
