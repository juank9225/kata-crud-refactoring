package co.com.sofka.crud.dao;


import co.com.sofka.crud.dto.CategorieListDto;

public interface CategorieListDao {

    Iterable<CategorieListDto> list();

    CategorieListDto save(CategorieListDto categorieListDto);

    void delete(Long id);

    CategorieListDto get(Long id);
}
