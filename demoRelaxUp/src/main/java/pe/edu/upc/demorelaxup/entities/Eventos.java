package pe.edu.upc.demorelaxup.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Eventos")
public class Eventos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ideventos;
    @Column(name="titulo",nullable = false,length = 40)
    private String titulo;
    @Column(name="actividad",nullable = false,length = 60)
    private String actividad;
    @Column(name="fecha inicio",nullable = false,length = 10)
    private String fechaInicio;
    @Column(name = "fecha fin",nullable = false,length = 10)
    private String fechaFin;
    @Column(name = "hora",nullable = false,length = 10)
    private String hora;
    @ManyToOne
    @JoinColumn(name="idUsuario")
    private Usuario us;
    public Eventos(){}
    public Eventos(int ideventos,String titulo, String actividad, String fechaInicio, String fechaFin, String hora, Usuario us) {
        this.ideventos = ideventos;
        this.titulo = titulo;
        this.actividad = actividad;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.hora = hora;
        this.us = us;
    }

    public int getIdeventos() {
        return ideventos;
    }

    public void setIdeventos(int ideventos) {
        this.ideventos = ideventos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Usuario getUs() {
        return us;
    }

    public void setUs(Usuario us) {
        this.us = us;
    }
}

