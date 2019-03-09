package data;

import java.util.ArrayList;
import java.util.Date;

public class Guia extends Usuario {
	private String tipoGuia;
	private ArrayList <String> diasDisponibles;
	private ArrayList <Integer> horasDisponibles;

    public Guia(String nombre, String apellido, String nick, String email, String clave, String ciudad, String genero, Date fechaNacimiento, String respuestaSeguridad) {
        super(nombre, apellido, nick, email, clave, ciudad, genero, fechaNacimiento, respuestaSeguridad);
    }

	public String getTipoGuia() {
		return tipoGuia;
	}

	public void setTipoGuia(String tipoGuia) {
		this.tipoGuia = tipoGuia;
	}

	public ArrayList<String> getDiasDisponibles() {
		return diasDisponibles;
	}

	public void setDiasDisponibles(ArrayList<String> diasDisponibles) {
		this.diasDisponibles = diasDisponibles;
	}

	public ArrayList<Integer> getHorasDisponibles() {
		return horasDisponibles;
	}

	public void setHorasDisponibles(ArrayList<Integer> horasDisponibles) {
		this.horasDisponibles = horasDisponibles;
	}
	
}
