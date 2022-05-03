package co.com.sofka.todolistback.controllers;
import co.com.sofka.todolistback.models.TareasModel;
import co.com.sofka.todolistback.services.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class TareasController {
    @Autowired
    private TareaService service;

    @GetMapping(value = "api/todos")
    public Iterable<TareasModel> list() {
        return service.list();
    }

    @PostMapping(value = "api/todo")
    public TareasModel save(@RequestBody TareasModel tarea) {
        return service.save(tarea);
    }

    @PutMapping(value = "api/todo")
    public TareasModel update(@RequestBody TareasModel tarea) {
        if (tarea.getId() != null) {
            return service.save(tarea);
        }
        throw new RuntimeException("No existe el ID");
    }
    @GetMapping(value = "api/{id}/todo")
    public TareasModel get(@PathVariable("id") Long id) {
        return service.get(id);
    }

    @DeleteMapping(value = "api/{id}/todo")
    public void delete(@PathVariable("id") Long id) {
        service.delete(id);
    }
}