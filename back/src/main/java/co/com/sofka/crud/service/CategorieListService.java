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
    public Iterable<CategorieListDto> list() {
        return mapperCategorieList.listaCategorias(
                (List<CategorieList>) categorieRepository.findAll());
    }

    @Override
    public CategorieListDto save(CategorieListDto categorieListDto) {
        CategorieList categoria = mapperCategorieList.CategorieListModeloDao(categorieListDto);
        return mapperCategorieList.modeloCtegorieListDao(categorieRepository.save(categoria));
    }

    @Override
    public void delete(Long id) {
        categorieRepository.delete(mapperCategorieList.CategorieListModeloDao(get(id)));
    }

    @Override
    public CategorieListDto get(Long id) {
        CategorieList categorieList = categorieRepository.findById(id).orElseThrow();
        return mapperCategorieList.modeloCtegorieListDao(categorieList);
    }
}
