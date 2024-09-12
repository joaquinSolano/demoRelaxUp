package pe.edu.upc.demorelaxup.serviceinterfaces;

import pe.edu.upc.demorelaxup.entities.Emergencia;

import java.util.List;

public interface IEmergenciaService {
    public List<Emergencia> list();
    public void insert(Emergencia ee);
}
