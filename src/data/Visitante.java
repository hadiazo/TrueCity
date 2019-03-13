package data;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Visitante extends Usuario {

    private ArrayList<String> interesesTuristicos;
    private String numCelular;
    private String destino;
    private Calendar fechaTour; //Y también la hora del día
    private int duracionMaxTour; //Se hace en horas

    public Visitante(String nombre, String apellido, String nick, String email, String clave, String ciudad, String genero, Date fechaNacimiento, String respuestaSeguridad) {
        super(nombre, apellido, nick, email, clave, ciudad, genero, fechaNacimiento, respuestaSeguridad);
    }

    public ArrayList<String> getInteresesTuristicos() {
        return interesesTuristicos;
    }

    public void setInteresesTuristicos(ArrayList<String> interesesTuristicos) {
        this.interesesTuristicos = interesesTuristicos;
    }

    public String getNumCelular() {
        return numCelular;
    }

    public void setNumCelular(String numCelular) {
        this.numCelular = numCelular;
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

    public Calendar getFechaTour() {
        return fechaTour;
    }

    public void setFechaTour(Calendar fechaTour) {
        this.fechaTour = fechaTour;
    }

    @Override
    public String toString() {
        String info = super.getNick();
        for(int i=0; i<this.getInteresesTuristicos().size(); i++) {
            info = info.concat(";" + this.getInteresesTuristicos().get(i));
        }
        info = info + ";" + this.getNumCelular() + "\n";
        return info;
    }
    
}
