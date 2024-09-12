package pe.edu.upc.demorelaxup.entities;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="MensajesForos")
public class MensajesForos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMensajesForos;
    @Column(name = "contenido",nullable = false, length = 200)
    private String contenido;
    @Column(name = "fechaPublicacion",nullable = false)
    private LocalDate fechaPublicacion;
    @ManyToOne
    @JoinColumn(name="idUsuario")
    private Usuario us;
    @ManyToOne
    @JoinColumn(name="idForos")
    private Foros fs;
    public MensajesForos (){

    }
    public MensajesForos(int idMensajesForos, String contenido, LocalDate fechaPublicacion, Usuario us, Foros fs) {
        this.idMensajesForos = idMensajesForos;
        this.contenido = contenido;
        this.fechaPublicacion = fechaPublicacion;
        this.us = us;
        this.fs =fs;
    }
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
