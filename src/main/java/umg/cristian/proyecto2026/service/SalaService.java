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

import umg.cristian.proyecto2026.entity.Sala;
import umg.cristian.proyecto2026.repository.SalaRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/sala")
public class SalaService {

    final SalaRepository sr;

    SalaService(SalaRepository sr) {
        this.sr = sr;
    }

    @GetMapping(path="/buscar")
    public List<Sala> buscarSalas() {
        return sr.findAll();
    }

    @PostMapping(path="/guardar")
    public Sala guardarSala(@RequestBody Sala sala) {
        return sr.save(sala);
    }

    @DeleteMapping(path="/eliminar/{idsala}")
    public void eliminarSala(@PathVariable("idsala") int idsala) {
        sr.deleteById(idsala);
    }

}