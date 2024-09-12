package pe.edu.upc.demorelaxup.entities;

import jakarta.persistence.*;

@Entity

public class Planes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int idPlan;
    @Column(name = "nombrePlan", nullable = false, length = 20)
    public String nombrePlan;
    @Column(name = "descripcion", nullable = false, length = 20)
    public String descripcion;
    @Column(name = "precio", nullable = false, length = 20)
    public double precio;

    public Planes() {
    }

    public Planes(int idPlan, String nombrePlan, String descripcion, double precio) {
        this.idPlan = idPlan;
        this.nombrePlan = nombrePlan;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public int getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(int idPlan) {
        this.idPlan = idPlan;
    }

    public String getNombrePlan() {
        return nombrePlan;
    }

    public void setNombrePlan(String nombrePlan) {
        this.nombrePlan = nombrePlan;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
