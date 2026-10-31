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

import umg.cristian.proyecto2026.entity.Anuncio;
import umg.cristian.proyecto2026.repository.AnuncioRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/anuncio")
public class AnuncioService {

    final AnuncioRepository ar;

    AnuncioService(AnuncioRepository ar) {
        this.ar = ar;
    }

    @GetMapping(path="/buscar")
    public List<Anuncio> buscarAnuncios() {
        return ar.findAll();
    }

    @PostMapping(path="/guardar")
    public Anuncio guardarAnuncio(@RequestBody Anuncio anuncio) {
        return ar.save(anuncio);
    }

    @DeleteMapping(path="/eliminar/{idanuncio}")
    public void eliminarAnuncio(@PathVariable("idAnuncio") int idanuncio) {
        ar.deleteById(idanuncio);
    }

}