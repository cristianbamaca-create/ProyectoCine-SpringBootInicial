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

import umg.cristian.proyecto2026.entity.Asiento;
import umg.cristian.proyecto2026.repository.AsientoRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/asiento")
public class AsientoService {

    final AsientoRepository ar;

    AsientoService(AsientoRepository ar) {
        this.ar = ar;
    }

    @GetMapping(path="/buscar")
    public List<Asiento> buscarAsientos() {
        return ar.findAll();
    }

    @PostMapping(path="/guardar")
    public Asiento guardarAsiento(@RequestBody Asiento asiento) {
        return ar.save(asiento);
    }

    @DeleteMapping(path="/eliminar/{idasiento}")
    public void eliminarAsiento(@PathVariable("idasiento") int idasiento) {
        ar.deleteById(idasiento);
    }
}