package co.com.sofka.todolistback.services;

import co.com.sofka.todolistback.models.TareasModel;
import co.com.sofka.todolistback.repositories.TareasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TareaService {

    @Autowired
    private TareasRepository repository;

    public Iterable<TareasModel> list(){
        return repository.findAll();
    }

    public TareasModel save(TareasModel tarea){
        return repository.save(tarea);
    }

    public TareasModel get(Long id){
        return repository.findById(id).orElseThrow();
    }

    public void delete(long id){
        repository.delete(get(id));
    }
}
