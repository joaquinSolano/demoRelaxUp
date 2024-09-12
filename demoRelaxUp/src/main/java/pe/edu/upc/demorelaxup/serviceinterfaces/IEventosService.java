package pe.edu.upc.demorelaxup.serviceinterfaces;
import pe.edu.upc.demorelaxup.entities.Eventos;
import java.util.List;

public interface IEventosService {
    public List<Eventos> list();

    public void insert(Eventos eventos);

    public Eventos listId(int id);

    public void update(Eventos eventos);

    public void delete(int id);
}
