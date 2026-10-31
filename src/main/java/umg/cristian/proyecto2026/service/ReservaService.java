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

import umg.cristian.proyecto2026.entity.Reserva;
import umg.cristian.proyecto2026.repository.ReservaRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/reserva")
public class ReservaService {

    final ReservaRepository rr;

    ReservaService(ReservaRepository rr) {
        this.rr = rr;
    }

    @GetMapping(path="/buscar")
    public List<Reserva> buscarReservas() {
        return rr.findAll();
    }

    @PostMapping(path="/guardar")
    public Reserva guardarReserva(@RequestBody Reserva reserva) {
        return rr.save(reserva);
    }

    @DeleteMapping(path="/eliminar/{idreserva}")
    public void eliminarReserva(@PathVariable("idreserva") int idreserva) {
        rr.deleteById(idreserva);
    }
}