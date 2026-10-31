package umg.cristian.proyecto2026.service;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import umg.cristian.proyecto2026.entity.Examen;
import umg.cristian.proyecto2026.repository.ExamenRepository;

@RestController
@CrossOrigin(origins = "http://localhost:42003")
@RequestMapping("examen")
public class ExamenService {

    final ExamenRepository ar;

    ExamenService(ExamenRepository ar) {
        this.ar = ar;
    }

    @GetMapping(path="/buscar")
    public List<Examen> buscarExamen() {
        return ar.findAll();
    }

    @PostMapping(path="/guardar")
    public Examen guardarExamen(@RequestBody Examen examen) {
        return ar.save(examen);
    }

    @DeleteMapping(path="/eliminar/{idexamen}")
    public void eliminarAnuncio(@PathVariable("idExamen") int idexamen) {
        ar.deleteById(idexamen);
    }

}