package pe.edu.upc.demorelaxup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.demorelaxup.entities.MensajesForos;
import org.springframework.stereotype.Repository;

@Repository
public interface IMensajesForosRepository extends JpaRepository<MensajesForos,Integer> {
}