package pe.edu.upc.demorelaxup.serviceinterfaces;

import org.springframework.data.repository.query.Param;
import pe.edu.upc.demorelaxup.entities.Rol;

import java.util.List;

public interface IRolService {
    public List<Rol> list();

    public void insert (Rol rol);

    public Rol listId(int id);

    public void update(Rol a);

    public void delete(int id);
    public List<Rol> buscarNombre(String nombre);
}
