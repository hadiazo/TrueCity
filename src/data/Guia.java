package data;

import java.util.Date;

public class Guia extends Usuario {
	private String tipoGuia;
        private int numCelular;
	private String descripcion;

    public Guia(String nombre, String apellido, String nick, String email, String clave, String ciudad, String genero, Date fechaNacimiento, String respuestaSeguridad) {
        super(nombre, apellido, nick, email, clave, ciudad, genero, fechaNacimiento, respuestaSeguridad);
    }

    public String getTipoGuia() {
        return tipoGuia;
    }

    public void setTipoGuia(String tipoGuia) {
        this.tipoGuia = tipoGuia;
    }

    public int getNumCelular() {
        return numCelular;
    }

    public void setNumCelular(int numCelular) {
        this.numCelular = numCelular;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
