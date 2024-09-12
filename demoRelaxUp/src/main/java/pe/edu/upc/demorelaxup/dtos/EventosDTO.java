package pe.edu.upc.demorelaxup.dtos;

public class EventosDTO {
    private int ideventos;
    private String titulo;
    private String actividad;
    private String fechaInicio;
    private String fechaFin;
    private String hora;

    public int getIdeventos() {
        return ideventos;
    }

    public void setIdeventos(int ideventos) {
        this.ideventos = ideventos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
