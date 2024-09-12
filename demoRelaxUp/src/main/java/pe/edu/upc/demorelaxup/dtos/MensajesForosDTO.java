package pe.edu.upc.demorelaxup.dtos;

import pe.edu.upc.demorelaxup.entities.Usuario;
import pe.edu.upc.demorelaxup.entities.Foros;
import java.time.LocalDate;
public class MensajesForosDTO {
    private int idMensajesForos;
    private String contenido;
    private LocalDate fechaPublicacion;
    private Usuario us;
    private Foros fs;

    public int getIdMensajesForos() {
        return idMensajesForos;
    }

    public void setIdMensajesForos(int idMensajesForos) {
        this.idMensajesForos = idMensajesForos;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Usuario getUs() {
        return us;
    }

    public void setUs(Usuario us) {
        us = us;
    }

    public Foros getFs() {
        return fs;
    }

    public void setFs(Foros fs) {
        fs = fs;
    }
}