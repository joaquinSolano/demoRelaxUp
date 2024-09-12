package pe.edu.upc.demorelaxup.serviceinterfaces;

import pe.edu.upc.demorelaxup.entities.Usuario;

import java.util.List;

public interface IUsuarioService {

    public List<Usuario> list();
    public void insert(Usuario uu);
    public List<String[ ]> ForosByUsuario();
}
