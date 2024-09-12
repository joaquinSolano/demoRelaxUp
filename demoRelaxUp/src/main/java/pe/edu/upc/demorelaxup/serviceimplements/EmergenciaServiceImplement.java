package pe.edu.upc.demorelaxup.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demorelaxup.entities.Emergencia;
import pe.edu.upc.demorelaxup.repositories.IEmergenciaRepository;
import pe.edu.upc.demorelaxup.serviceinterfaces.IEmergenciaService;

import java.util.List;

@Service
public class EmergenciaServiceImplement implements IEmergenciaService {

    @Autowired
    private IEmergenciaRepository eR;

    @Override
    public List<Emergencia> list(){
        return eR.findAll();
    }

    @Override
    public void insert(Emergencia ee){
        eR.save(ee);
    }
}
