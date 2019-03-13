package data;

import java.util.ArrayList;
import java.util.Date;

//Karl Weierstrass — 'When I wrote this, only God and I understood what I was doing. Now, God only knows.'

public class Guia extends Usuario {
	private String tipoGuia;
        private String numCelular;
	private String descripcion;
        //private ArrayList <Visitante> visitantesInteresados;

    public Guia(String nombre, String apellido, String nick, String email, String clave, String ciudad, String genero, Date fechaNacimiento, String respuestaSeguridad) {
        super(nombre, apellido, nick, email, clave, ciudad, genero, fechaNacimiento, respuestaSeguridad);
    }

    public String getTipoGuia() {
        return tipoGuia;
    }

    public void setTipoGuia(String tipoGuia) {
        this.tipoGuia = tipoGuia;
    }

    public String getNumCelular() {
        return numCelular;
    }

    public void setNumCelular(String numCelular) {
        this.numCelular = numCelular;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /*public ArrayList<Visitante> getVisitantesInteresados() {
        return visitantesInteresados;
    }

    public void setVisitantesInteresados(ArrayList<Visitante> visitantesInteresados) {
        this.visitantesInteresados = visitantesInteresados;
    }*/
    
    @Override
    public String toString() {
        String info = super.getNick() + ";" + this.getTipoGuia() + ";" + this.getNumCelular() + ";" + this.getDescripcion() + "\n";
        return info;
    }
    
    /*public String toString(ArrayList<Visitante> visitantesInteresados) {
        String info = super.getNick();
        for(int i=0; i<visitantesInteresados.size(); i++) {
            info = info.concat(";" + this.visitantesInteresados.get(i).getNick());
        }
        info = info + "\n";
        return info;
    }*/
    
}
