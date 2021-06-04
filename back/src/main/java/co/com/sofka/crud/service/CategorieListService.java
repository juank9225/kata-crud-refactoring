package co.com.sofka.crud.service;

import co.com.sofka.crud.dao.CategorieListDao;
import co.com.sofka.crud.dto.CategorieListDto;
import co.com.sofka.crud.entity.CategorieList;
import co.com.sofka.crud.mapper.MapperCategorieList;
import co.com.sofka.crud.repository.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieListService implements CategorieListDao {

    @Autowired
    private CategorieRepository categorieRepository;
    @Autowired
    private MapperCategorieList mapperCategorieList;


    @Override
    public Iterable<CategorieList> list() {
        return  categorieRepository.findAll();
    }

    @Override
    public CategorieList save(CategorieList categorieList) {
        return categorieRepository.save(categorieList);
    }

    @Override
    public void delete(Long id) {
        categorieRepository.delete(get(id));
    }

    @Override
    public CategorieList get(Long id) {
        return categorieRepository.findById(id).orElseThrow();

    }
}
