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

import umg.cristian.proyecto2026.entity.Rol;
import umg.cristian.proyecto2026.repository.RolRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/rol")
public class RolService {

    final RolRepository rr;

    RolService(RolRepository rr) {
        this.rr = rr;
    }

    @GetMapping(path="/buscar")
    public List<Rol> buscarRoles() {
        return rr.findAll();
    }

    @PostMapping(path="/guardar")
    public Rol guardarRol(@RequestBody Rol rol) {
        return rr.save(rol);
    }

    @DeleteMapping(path="/eliminar/{idrol}")
    public void eliminarRol(@PathVariable("idrol") int idrol) {
        rr.deleteById(idrol);
    }
}