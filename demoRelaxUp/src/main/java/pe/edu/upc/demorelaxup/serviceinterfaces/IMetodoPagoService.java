package pe.edu.upc.demorelaxup.serviceinterfaces;

import pe.edu.upc.demorelaxup.entities.MetodoPago;

import java.util.List;

public interface IMetodoPagoService {

    public List<MetodoPago> list();

    public void insert(MetodoPago metodoPago);

    public MetodoPago listId(int id);

    public void update(MetodoPago metodoPago);

    public void delete(int id);
}
