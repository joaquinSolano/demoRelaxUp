package pe.edu.upc.demorelaxup.dtos;

public class CantidadMensajesForosDTO {
    public String getNameForo() {
        return nameForo;
    }

    public void setNameForo(String nameForo) {
        this.nameForo = nameForo;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public int getCantidadMensajesForos() {
        return CantidadMensajesForos;
    }

    public void setCantidadMensajesForos(int cantidadMensajesForos) {
        CantidadMensajesForos = cantidadMensajesForos;
    }

    public String nameForo;
    public String nameUser;
    public int CantidadMensajesForos;
}
