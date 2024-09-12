package pe.edu.upc.demorelaxup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demorelaxup.entities.MetodoPago;
@Repository
public interface IMetodoPagoRepository extends JpaRepository<MetodoPago, Integer> {
}
