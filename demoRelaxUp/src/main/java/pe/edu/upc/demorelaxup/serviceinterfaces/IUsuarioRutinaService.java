package pe.edu.upc.demorelaxup.serviceinterfaces;

import pe.edu.upc.demorelaxup.entities.UsuarioRutina;

import java.util.List;

public interface IUsuarioRutinaService {
    public List<UsuarioRutina> list();

    public void insert(UsuarioRutina usuarioRutina);

    public UsuarioRutina listId(int id);

    public void update(UsuarioRutina usuarioRutina);

    public void delete(int id);
}