package umg.cristian.proyecto2026.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import umg.cristian.proyecto2026.entity.Reserva;

@Repository("reservaRepository")
public interface ReservaRepository extends JpaRepository<Reserva, Integer> {

}