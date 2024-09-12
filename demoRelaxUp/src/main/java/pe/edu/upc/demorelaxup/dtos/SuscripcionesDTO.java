package pe.edu.upc.demorelaxup.dtos;

import pe.edu.upc.demorelaxup.entities.MetodoPago;
import pe.edu.upc.demorelaxup.entities.Planes;
import pe.edu.upc.demorelaxup.entities.Usuario;

import java.time.LocalDate;

public class SuscripcionesDTO {

    private int idSuscripcion;

    private LocalDate fechaInicio;

    private LocalDate fechaFin;

    private Usuario usuario;

    private MetodoPago metodoPago;

    private Planes planes;

    public int getIdSuscripcion() {
        return idSuscripcion;
    }

    public void setIdSuscripcion(int idSuscripcion) {
        this.idSuscripcion = idSuscripcion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public Planes getPlanes() {
        return planes;
    }

    public void setPlanes(Planes planes) {
        this.planes = planes;
    }
}
