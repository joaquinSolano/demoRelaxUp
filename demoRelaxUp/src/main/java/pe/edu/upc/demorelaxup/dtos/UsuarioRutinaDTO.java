package pe.edu.upc.demorelaxup.dtos;

public class UsuarioRutinaDTO {
    private int idusuariorutina;
    private String fecharealizacion;
    private String progreso;

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
}