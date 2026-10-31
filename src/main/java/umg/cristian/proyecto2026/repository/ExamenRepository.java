package umg.cristian.proyecto2026.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import umg.cristian.proyecto2026.entity.Examen;

@Repository("examenRepository")
public interface ExamenRepository extends JpaRepository<Examen, Integer> {
	
}