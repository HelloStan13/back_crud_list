package co.com.sofka.todolistback.repositories;

import co.com.sofka.todolistback.models.TareasModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TareasRepository extends CrudRepository<TareasModel, Long> {
}
