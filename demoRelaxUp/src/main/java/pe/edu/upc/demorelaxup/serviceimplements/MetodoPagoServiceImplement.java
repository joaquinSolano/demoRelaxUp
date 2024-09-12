package pe.edu.upc.demorelaxup.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demorelaxup.entities.MetodoPago;
import pe.edu.upc.demorelaxup.repositories.IMetodoPagoRepository;
import pe.edu.upc.demorelaxup.serviceinterfaces.IMetodoPagoService;

import java.util.List;

@Service
public class MetodoPagoServiceImplement implements IMetodoPagoService {

    @Autowired
    private IMetodoPagoRepository mpR;

    @Override
    public List<MetodoPago> list() { return mpR.findAll(); }

    @Override
    public void insert(MetodoPago metodoPago) { mpR.save(metodoPago); }

    @Override
    public MetodoPago listId(int id) { return mpR.findById(id).orElse(new MetodoPago());}

    @Override
    public void update(MetodoPago metodoPago) { mpR.save(metodoPago);}

    @Override
    public void delete(int id) { mpR.deleteById(id);}
}
