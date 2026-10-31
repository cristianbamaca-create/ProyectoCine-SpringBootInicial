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

import umg.cristian.proyecto2026.entity.Funcion;
import umg.cristian.proyecto2026.repository.FuncionRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/funcion")
public class FuncionService {

    final FuncionRepository fr;

    FuncionService(FuncionRepository fr) {
        this.fr = fr;
    }

    @GetMapping(path="/buscar")
    public List<Funcion> buscarFunciones() {
        return fr.findAll();
    }

    @PostMapping(path="/guardar")
    public Funcion guardarFuncion(@RequestBody Funcion funcion) {
        return fr.save(funcion);
    }

    @DeleteMapping(path="/eliminar/{idfuncion}")
    public void eliminarFuncion(@PathVariable("idfuncion") int idfuncion) {
        fr.deleteById(idfuncion);
    }
}