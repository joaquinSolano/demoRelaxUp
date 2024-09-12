package pe.edu.upc.demorelaxup.dtos;

import pe.edu.upc.demorelaxup.entities.Usuario;

import java.sql.Time;
import java.time.LocalDate;

public class EmergenciaDTO {
    private int idEmergencia;
    private LocalDate fechaEmergencia;
    private Time horaEmergencia;

    private Usuario us;


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
