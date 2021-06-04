package co.com.sofka.crud.repository;

import co.com.sofka.crud.entity.CategorieList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieRepository extends CrudRepository<CategorieList, Long> {
}
