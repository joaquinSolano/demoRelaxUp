package pe.edu.upc.demorelaxup.serviceinterfaces;

import pe.edu.upc.demorelaxup.entities.Suscripciones;

import java.util.List;

public interface ISuscripcionesService {

    public List<Suscripciones> list();

    public void insert(Suscripciones suscripciones);

    public Suscripciones listId(int id);
}
