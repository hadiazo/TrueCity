package data;

import java.util.ArrayList;

public class Guia extends Usuario {
	private String tipoGuia;
	private ArrayList <String> diasDisponibles;
	private ArrayList <Integer> horasDisponibles;
	
	public Guia(String nombre, String nick, String clave, String ciudad) {
		super(nombre, nick, clave, ciudad);
		// TODO Auto-generated constructor stub
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
