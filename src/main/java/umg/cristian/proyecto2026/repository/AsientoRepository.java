package umg.cristian.proyecto2026.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import umg.cristian.proyecto2026.entity.Asiento;

@Repository("asientoRepository")
public interface AsientoRepository extends JpaRepository<Asiento, Integer> {
	
}