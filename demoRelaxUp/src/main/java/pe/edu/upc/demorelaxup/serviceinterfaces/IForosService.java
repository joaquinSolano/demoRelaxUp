package pe.edu.upc.demorelaxup.serviceinterfaces;
import pe.edu.upc.demorelaxup.entities.Foros;
import java.util.List;

public interface IForosService {
    public List<Foros> list();

    public void insert(Foros foros);

    public Foros listId(int id);

    public void update(Foros foros);

    public void delete(int id);

    public List<String[]> CantidadMensajesForos();
}

