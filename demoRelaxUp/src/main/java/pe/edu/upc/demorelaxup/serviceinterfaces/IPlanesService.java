package pe.edu.upc.demorelaxup.serviceinterfaces;

import pe.edu.upc.demorelaxup.entities.Planes;

import java.util.List;

public interface IPlanesService {

    public List<Planes> list();

    public Planes listId(int id);

    public void update(Planes planes);

    public List<String[]> totalSuscripcion();

    public List<String[]> totalIngreso();
}
