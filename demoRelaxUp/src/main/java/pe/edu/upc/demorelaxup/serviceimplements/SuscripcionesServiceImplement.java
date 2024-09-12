package pe.edu.upc.demorelaxup.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demorelaxup.entities.Suscripciones;
import pe.edu.upc.demorelaxup.repositories.ISuscripcionesRepository;
import pe.edu.upc.demorelaxup.serviceinterfaces.ISuscripcionesService;

import java.util.List;

@Service
public class SuscripcionesServiceImplement implements ISuscripcionesService {

    @Autowired
    private ISuscripcionesRepository sR;

    @Override
    public List<Suscripciones> list() { return sR.findAll();}

    @Override
    public void insert(Suscripciones suscripciones) { sR.save(suscripciones); }

    @Override
    public Suscripciones listId(int id) { return sR.findById(id).orElse(new Suscripciones()); }
}
