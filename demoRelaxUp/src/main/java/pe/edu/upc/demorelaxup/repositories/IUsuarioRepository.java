package pe.edu.upc.demorelaxup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demorelaxup.entities.Usuario;

import java.util.List;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {
@Query(value = "Select u.nombre_usuario, count(*)\n" +
        " from usuario u inner join foros f \n" +
        " on u.id_usuario=f.id_usuario \n" +
        " group by u.nombre_usuario",nativeQuery = true)
    public List<String[ ]> ForosByUsuario();
}
