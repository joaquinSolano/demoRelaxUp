package pe.edu.upc.demorelaxup.dtos;
import pe.edu.upc.demorelaxup.entities.Usuario;

public class MetodoPagoDTO {

    private int idMetodoPago;

    private String tipoPago;

    private Usuario Us;

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
