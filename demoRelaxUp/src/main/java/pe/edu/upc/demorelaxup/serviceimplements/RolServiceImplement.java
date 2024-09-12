package pe.edu.upc.demorelaxup.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demorelaxup.entities.Rol;
import pe.edu.upc.demorelaxup.repositories.IRolRepository;
import pe.edu.upc.demorelaxup.serviceinterfaces.IRolService;

import java.util.List;

@Service
public class RolServiceImplement implements IRolService {
    @Autowired
    private IRolRepository rR;

    @Override
    public List<Rol> list() {
        return rR.findAll();
    }

    @Override
    public void insert (Rol rol) {
        rR.save(rol);
    }

    @Override
    public Rol listId(int id) {
        return rR.findById(id).orElse(new Rol());
    }

    @Override
    public void update(Rol a) {
        rR.save(a);
    }

    @Override
    public void delete(int id) {
        rR.deleteById(id);
    }

    @Override
    public List<Rol> buscarNombre(String nombre) {
        return rR.buscarNombre(nombre);
    }
}
