package pe.edu.upc.demorelaxup.dtos;

import pe.edu.upc.demorelaxup.entities.Usuario;

public class ForosDTO {
    private int idForos;
    private String titulo;
    private Usuario us;
    public int getIdForos() {
        return idForos;
    }

    public void setIdForos(int idForos) {
        this.idForos = idForos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Usuario getUs() {
        return us;
    }

    public void setUs(Usuario us) {
        us = us;
    }


}


