package pe.edu.upc.demorelaxup.entities;
import jakarta.persistence.*;

@Entity
@Table(name = "Foros")
public class Foros {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idForos;
    @Column(name = "titulo",nullable = false, length = 40)
    private String titulo;
    @ManyToOne
    @JoinColumn(name="idUsuario")
    private Usuario us;

    public Foros() {
    }
    public Foros(int idForos, String titulo, Usuario us) {
        this.idForos = idForos;
        this.titulo = titulo;
        this.us = us;
    }
    public void setIdForos(int idForos) {
        this.idForos = idForos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Usuario getUs() {
        return us;
    }

    public void setUs(Usuario us) {
        us = us;
    }
}
