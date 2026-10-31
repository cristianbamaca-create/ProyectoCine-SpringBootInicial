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

import umg.cristian.proyecto2026.entity.Clasificacion;
import umg.cristian.proyecto2026.repository.ClasificacionRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/clasificacion")
public class ClasificacionService {

    final ClasificacionRepository cr;

    ClasificacionService(ClasificacionRepository cr) {
        this.cr = cr;
    }

    @GetMapping(path="/buscar")
    public List<Clasificacion> buscarClasificaciones() {
        return cr.findAll();
    }

    @PostMapping(path="/guardar")
    public Clasificacion guardarClasificacion(@RequestBody Clasificacion clasificacion) {
        return cr.save(clasificacion);
    }

    @DeleteMapping(path="/eliminar/{idclasificacion}")
    public void eliminarClasificacion(@PathVariable("idclasificacion") int idclasificacion) {
        cr.deleteById(idclasificacion);
    }

}