package pe.edu.upc.demorelaxup.entities;


import jakarta.persistence.*;

import java.sql.Time;
import java.time.LocalDate;

@Entity
@Table(name = "Emergencia")
public class Emergencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEmergencia;
    @Column(name = "fechaEmergencia",nullable = false)
    private LocalDate fechaEmergencia;
    @Column(name = "horaEmergencia",nullable = false)
    private Time horaEmergencia;
    @ManyToOne
    @JoinColumn(name="idUsuario")
    private Usuario us;

    public Emergencia() {
    }

    public Emergencia(int idEmergencia, LocalDate fechaEmergencia, Time horaEmergencia, Usuario us) {
        this.idEmergencia = idEmergencia;
        this.fechaEmergencia = fechaEmergencia;
        this.horaEmergencia = horaEmergencia;
        this.us = us;
    }

    public int getIdEmergencia() {
        return idEmergencia;
    }

    public void setIdEmergencia(int idEmergencia) {
        this.idEmergencia = idEmergencia;
    }

    public LocalDate getFechaEmergencia() {
        return fechaEmergencia;
    }

    public void setFechaEmergencia(LocalDate fechaEmergencia) {
        this.fechaEmergencia = fechaEmergencia;
    }

    public Time getHoraEmergencia() {
        return horaEmergencia;
    }

    public void setHoraEmergencia(Time horaEmergencia) {
        this.horaEmergencia = horaEmergencia;
    }

    public Usuario getUs() {
        return us;
    }

    public void setUs(Usuario us) {
        this.us = us;
    }
}
