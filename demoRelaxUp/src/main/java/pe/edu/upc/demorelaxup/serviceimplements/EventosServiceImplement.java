package pe.edu.upc.demorelaxup.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demorelaxup.entities.Eventos;
import pe.edu.upc.demorelaxup.repositories.IEventosRepository;
import pe.edu.upc.demorelaxup.serviceinterfaces.IEventosService;

import java.util.List;

@Service
public class EventosServiceImplement implements IEventosService {

    @Autowired
    private IEventosRepository eS;

    @Override
    public List<Eventos> list() { return eS.findAll(); }

    @Override
    public void insert(Eventos eventos) { eS.save(eventos); }

    @Override
    public Eventos listId(int id) { return eS.findById(id).orElse(new Eventos()); }

    @Override
    public void update(Eventos eventos) { eS.save(eventos); }

    @Override
    public void delete(int id) { eS.deleteById(id); }
}
