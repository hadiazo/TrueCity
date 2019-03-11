package data;

import java.util.ArrayList;
import java.util.Date;

public class Visitante extends Usuario {

    private ArrayList<String> interesesTuristicos;
    private String destino;
    private int duracionMaxTour; //Se hace en minutos
    private Date fechaTour;

    public Visitante(String nombre, String apellido, String nick, String email, String clave, String ciudad, String genero, Date fechaNacimiento, String respuestaSeguridad) {
        super(nombre, apellido, nick, email, clave, ciudad, genero, fechaNacimiento, respuestaSeguridad);
    }

    public ArrayList<String> getInteresesTuristicos() {
        return interesesTuristicos;
    }

    public void setInteresesTuristicos(ArrayList<String> interesesTuristicos) {
        this.interesesTuristicos = interesesTuristicos;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
    
    public int getDuracionMaxTour() {
        return duracionMaxTour;
    }

    public void setDuracionMaxTour(int duracionMaxTour) {
        this.duracionMaxTour = duracionMaxTour;
    }

    public Date getFechaTour() {
        return fechaTour;
    }

    public void setFechaTour(Date fechaTour) {
        this.fechaTour = fechaTour;
    }

}
