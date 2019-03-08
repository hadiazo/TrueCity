package data;

public abstract class Usuario {
	private String nombre;
	private String nick;
	private String clave;
	private String ciudad;
	
	public Usuario(String nombre, String nick, String clave, String ciudad) {
		this.ciudad = ciudad;
		this.nombre = nombre;
		this.nick = nick;
		this.clave = clave;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
}
