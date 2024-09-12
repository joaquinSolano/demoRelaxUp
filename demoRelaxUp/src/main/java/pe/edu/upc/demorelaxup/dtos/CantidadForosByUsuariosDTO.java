package pe.edu.upc.demorelaxup.dtos;

public class CantidadForosByUsuariosDTO {

    public String getNombreUser() {
        return nombreUser;
    }

    public void setNombreUser(String nombreUser) {
        this.nombreUser = nombreUser;
    }

    public int getQuantityForos() {
        return QuantityForos;
    }

    public void setQuantityForos(int quantityForos) {
        QuantityForos = quantityForos;
    }

    public String nombreUser;
    public int QuantityForos;



}
