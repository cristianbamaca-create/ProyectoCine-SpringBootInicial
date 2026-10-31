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

import umg.cristian.proyecto2026.entity.Pelicula;
import umg.cristian.proyecto2026.repository.PeliculaRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/pelicula")
public class PeliculaService {

    final PeliculaRepository pr;

    PeliculaService(PeliculaRepository pr) {
        this.pr = pr;
    }

    @GetMapping(path="/buscar")
    public List<Pelicula> buscarPeliculas() {
        return pr.findAll();
    }

    @PostMapping(path="/guardar")
    public Pelicula guardarPelicula(@RequestBody Pelicula pelicula) {
        return pr.save(pelicula);
    }

    @DeleteMapping(path="/eliminar/{idpelicula}")
    public void eliminarPelicula(@PathVariable("idpelicula") int idpelicula) {
        pr.deleteById(idpelicula);
    }
}