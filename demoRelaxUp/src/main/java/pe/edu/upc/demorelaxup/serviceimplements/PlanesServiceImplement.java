package pe.edu.upc.demorelaxup.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demorelaxup.entities.Planes;
import pe.edu.upc.demorelaxup.repositories.IPlanesRepository;
import pe.edu.upc.demorelaxup.serviceinterfaces.IPlanesService;

import java.util.List;

@Service
public class PlanesServiceImplement implements IPlanesService {

    @Autowired
    private IPlanesRepository pR;

    @Override
    public List<Planes> list() { return pR.findAll();}

    @Override
    public Planes listId(int id) { return pR.findById(id).orElse(new Planes()); }

    @Override
    public void update(Planes planes) { pR.save(planes);}

    @Override
    public List<String[]> totalSuscripcion() { return pR.totalSuscripcion(); }

    @Override
    public List<String[]> totalIngreso() { return pR.totalIngreso(); }
}
