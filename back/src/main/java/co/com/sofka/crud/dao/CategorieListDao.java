package co.com.sofka.crud.dao;


import co.com.sofka.crud.entity.CategorieList;

public interface CategorieListDao {

    Iterable<CategorieList> list();

    CategorieList save(CategorieList categorieList);

    void delete(Long id);

    CategorieList get(Long id);
}
