package pe.edu.upc.demorelaxup.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demorelaxup.entities.MensajesForos;
import pe.edu.upc.demorelaxup.repositories.IMensajesForosRepository;
import pe.edu.upc.demorelaxup.serviceinterfaces.IMensajesForosService;

import java.util.List;

@Service
public class MensajesForosServiceImplement implements IMensajesForosService {

    @Autowired
    private IMensajesForosRepository mfR;

    @Override
    public List<MensajesForos> list() { return mfR.findAll(); }

    @Override
    public void insert(MensajesForos mensajesForos) { mfR.save(mensajesForos); }

    @Override
    public MensajesForos listId(int id) { return mfR.findById(id).orElse(new MensajesForos());}

    @Override
    public void update(MensajesForos mensajesForos) { mfR.save(mensajesForos);}

    @Override
    public void delete(int id) { mfR.deleteById(id);}
}
