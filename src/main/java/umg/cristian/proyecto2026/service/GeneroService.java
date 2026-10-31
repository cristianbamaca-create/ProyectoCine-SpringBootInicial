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

import umg.cristian.proyecto2026.entity.Genero;
import umg.cristian.proyecto2026.repository.GeneroRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/genero")
public class GeneroService {

    final GeneroRepository gr;

    GeneroService(GeneroRepository gr) {
        this.gr = gr;
    }

    @GetMapping(path="/buscar")
    public List<Genero> buscarGeneros() {
        return gr.findAll();
    }

    @PostMapping(path="/guardar")
    public Genero guardarGenero(@RequestBody Genero genero) {
        return gr.save(genero);
    }

    @DeleteMapping(path="/eliminar/{idgenero}")
    public void eliminarGenero(@PathVariable("idgenero") int idgenero) {
        gr.deleteById(idgenero);
    }

}