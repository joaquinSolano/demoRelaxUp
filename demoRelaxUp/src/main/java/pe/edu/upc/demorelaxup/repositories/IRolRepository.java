package pe.edu.upc.demorelaxup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demorelaxup.entities.Rol;

import java.util.List;

@Repository
public interface IRolRepository extends JpaRepository<Rol,Integer> {
    @Query("Select c from Rol c where c.nombreRol like %:nombre%")
    public List<Rol> buscarNombre(@Param("nombre") String nombre);
}
