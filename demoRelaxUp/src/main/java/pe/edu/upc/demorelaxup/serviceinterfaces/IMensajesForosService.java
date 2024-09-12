package pe.edu.upc.demorelaxup.serviceinterfaces;

import pe.edu.upc.demorelaxup.entities.MensajesForos;

import java.util.List;

public interface IMensajesForosService {

    public List<MensajesForos> list();

    public void insert(MensajesForos mensajesForos);

    public MensajesForos listId(int id);

    public void update(MensajesForos mensajesForos);

    public void delete(int id);
}

