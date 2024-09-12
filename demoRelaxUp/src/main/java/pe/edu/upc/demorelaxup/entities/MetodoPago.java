package pe.edu.upc.demorelaxup.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "MetodoPago")
public class MetodoPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMetodoPago;
    @Column(name = "tipoPago", nullable = false, length = 20)
    private String tipoPago;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario Us;

    public MetodoPago() {
    }

    public MetodoPago(int idMetodoPago, String tipoPago, Usuario us) {
        this.idMetodoPago = idMetodoPago;
        this.tipoPago = tipoPago;
        Us = us;
    }

    public int getIdMetodoPago() {
        return idMetodoPago;
    }

    public void setIdMetodoPago(int idMetodoPago) {
        this.idMetodoPago = idMetodoPago;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public Usuario getUs() {
        return Us;
    }

    public void setUs(Usuario us) {
        Us = us;
    }
}
