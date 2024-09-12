package pe.edu.upc.demorelaxup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demorelaxup.entities.Suscripciones;
@Repository
public interface ISuscripcionesRepository extends JpaRepository<Suscripciones, Integer> {
}
