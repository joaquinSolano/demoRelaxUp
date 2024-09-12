package pe.edu.upc.demorelaxup.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demorelaxup.entities.Foros;
import pe.edu.upc.demorelaxup.repositories.IForosRepository;
import pe.edu.upc.demorelaxup.serviceinterfaces.IForosService;

import java.util.List;

@Service
public class ForosServiceImplement implements IForosService {

    @Autowired
    private IForosRepository fR;

    @Override
    public List<Foros> list() { return fR.findAll(); }

    @Override
    public void insert(Foros foros) { fR.save(foros); }

    @Override
    public Foros listId(int id) { return fR.findById(id).orElse(new Foros());}

    @Override
    public void update(Foros foros) { fR.save(foros);}

    @Override
    public void delete(int id) { fR.deleteById(id);}

    @Override
    public List<String[]> CantidadMensajesForos() {
        return fR.CantidadMensajesForos();
    }
}