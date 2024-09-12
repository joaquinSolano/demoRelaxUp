package pe.edu.upc.demorelaxup.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    @Column(name = "nombreUsuario", nullable = false, length = 70)
    private String nombreUsuario;
    @Column(name = "correoUsuario", nullable = false, length = 70)
    private String correoUsuario;
    @Column(name = "telefonoUsuario", nullable = false, length = 9)
    private int telefonoUsuario;
    @Column(name = "contrasenaUsuario", nullable = false, length = 40)
    private String contrasenaUsuario;
    @Column(name = "progresoUsuario", nullable = false, length = 10)
    private int progresoUsuario;
    @ManyToOne
    @JoinColumn(name = "idRol")
    private Rol ro;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nombreUsuario, String correoUsuario, int telefonoUsuario, String contrasenaUsuario, int progresoUsuario, Rol ro) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.correoUsuario = correoUsuario;
        this.telefonoUsuario = telefonoUsuario;
        this.contrasenaUsuario = contrasenaUsuario;
        this.progresoUsuario = progresoUsuario;
        this.ro = ro;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public int getTelefonoUsuario() {
        return telefonoUsuario;
    }

    public void setTelefonoUsuario(int telefonoUsuario) {
        this.telefonoUsuario = telefonoUsuario;
    }

    public String getContrasenaUsuario() {
        return contrasenaUsuario;
    }

    public void setContrasenaUsuario(String contrasenaUsuario) {
        this.contrasenaUsuario = contrasenaUsuario;
    }

    public int getProgresoUsuario() {
        return progresoUsuario;
    }

    public void setProgresoUsuario(int progresoUsuario) {
        this.progresoUsuario = progresoUsuario;
    }

    public Rol getRo() {
        return ro;
    }

    public void setRo(Rol ro) {
        this.ro = ro;
    }
}
