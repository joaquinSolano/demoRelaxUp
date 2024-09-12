package pe.edu.upc.demorelaxup.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demorelaxup.entities.UsuarioRutina;
import pe.edu.upc.demorelaxup.repositories.IUsuarioRepository;
import pe.edu.upc.demorelaxup.repositories.IUsuarioRutinaRepository;
import pe.edu.upc.demorelaxup.serviceinterfaces.IUsuarioRutinaService;

import java.util.List;

@Service
public class UsuarioRutinaServiceImplement implements IUsuarioRutinaService {

    @Autowired
    private IUsuarioRutinaRepository Uu;

    @Override
    public List<UsuarioRutina> list() { return Uu.findAll(); }

    @Override
    public void insert(UsuarioRutina usuarioRutina) { Uu.save(usuarioRutina); }

    @Override
    public UsuarioRutina listId(int id) { return Uu.findById(id).orElse(new UsuarioRutina()); }

    @Override
    public void update(UsuarioRutina usuarioRutina) { Uu.save(usuarioRutina); }

    @Override
    public void delete(int id) { Uu.deleteById(id); }
}
