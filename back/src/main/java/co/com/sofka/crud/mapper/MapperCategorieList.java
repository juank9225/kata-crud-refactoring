package co.com.sofka.crud.mapper;

import co.com.sofka.crud.dto.CategorieListDto;
import co.com.sofka.crud.entity.CategorieList;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MapperCategorieList {

    CategorieListDto modeloCtegorieListDao(CategorieList categorieList);
    CategorieList CategorieListModeloDao(CategorieListDto categorieListDto);
    List<CategorieListDto> listaCategorias(List<CategorieList> categorieLists);
}
