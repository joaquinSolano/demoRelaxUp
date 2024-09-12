package pe.edu.upc.demorelaxup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.demorelaxup.entities.Eventos;

public interface IEventosRepository extends JpaRepository<Eventos, Integer> {
}
