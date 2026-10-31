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

import umg.cristian.proyecto2026.entity.DetalleReservaAsientos;
import umg.cristian.proyecto2026.repository.DetalleReservaAsientosRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/detalle-reserva-asientos")
public class DetalleReservaAsientosService {

    final DetalleReservaAsientosRepository drar;

    DetalleReservaAsientosService(DetalleReservaAsientosRepository drar) {
        this.drar = drar;
    }

    @GetMapping(path="/buscar")
    public List<DetalleReservaAsientos> buscarDetalles() {
        return drar.findAll();
    }

    @PostMapping(path="/guardar")
    public DetalleReservaAsientos guardarDetalle(@RequestBody DetalleReservaAsientos detalle) {
        return drar.save(detalle);
    }

    @DeleteMapping(path="/eliminar/{iddetalle}")
    public void eliminarDetalle(@PathVariable("iddetalle") int iddetalle) {
        drar.deleteById(iddetalle);
    }

}