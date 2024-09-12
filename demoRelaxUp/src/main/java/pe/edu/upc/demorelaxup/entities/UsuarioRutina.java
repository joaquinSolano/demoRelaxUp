package pe.edu.upc.demorelaxup.entities;

import jakarta.persistence.*;

@Entity
@Table(name="UsuarioRutina")
public class UsuarioRutina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idusuariorutina;
    @Column(name = "fecha realizacion",nullable = false,length = 10)
    private String fecharealizacion;
    @Column(name = "progreso",nullable = false,length = 3)
    private String progreso;
    @ManyToOne
    @JoinColumn(name="idUsuario")
    private Usuario us;
    public UsuarioRutina(){}
    public UsuarioRutina(int idusuariorutina,String fecharealizacion, String progreso, Usuario us) {
        this.idusuariorutina = idusuariorutina;
        this.fecharealizacion = fecharealizacion;
        this.progreso = progreso;
        this.us = us;
    }

    public int getIdusuariorutina() {
        return idusuariorutina;
    }

    public void setIdusuariorutina(int idusuariorutina) {
        this.idusuariorutina = idusuariorutina;
    }

    public String getFecharealizacion() {
        return fecharealizacion;
    }

    public void setFecharealizacion(String fecharealizacion) {
        this.fecharealizacion = fecharealizacion;
    }

    public String getProgreso() {
        return progreso;
    }

    public void setProgreso(String progreso) {
        this.progreso = progreso;
    }

    public Usuario getUs() {
        return us;
    }

    public void setUs(Usuario us) {
        this.us = us;
    }
}
