package pe.edu.upc.demorelaxup.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "Suscripciones")
public class Suscripciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSuscripcion;
    @Column(name = "fechaInicio", nullable = false)
    private LocalDate fechaInicio;
    @Column(name = "fechaFin", nullable = false)
    private LocalDate fechaFin;
    @OneToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;
    @OneToOne
    @JoinColumn(name = "idMetodoPago")
    private MetodoPago metodoPago;
    @ManyToOne
    @JoinColumn(name = "idPlan")
    private Planes planes;

    public Suscripciones() {
    }

    public Suscripciones(int idSuscripcion, LocalDate fechaInicio, LocalDate fechaFin, Usuario usuario, MetodoPago metodoPago, Planes planes) {
        this.idSuscripcion = idSuscripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.usuario = usuario;
        this.metodoPago = metodoPago;
        this.planes = planes;
    }

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
