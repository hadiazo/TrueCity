package data;

import java.util.Date;

public class Usuario {

    private String nombre;
    private String apellido;
    private String nick;
    private String email;
    private String clave;
    private String ciudad;
    private String genero;
    private Date fechaNacimiento;
    private String respuestaSeguridad;

    public Usuario(String nombre, String apellido, String nick, String email, String clave, String ciudad, String genero, Date fechaNacimiento, String respuestaSeguridad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nick = nick;
        this.email = email;
        this.clave = clave;
        this.ciudad = ciudad;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.respuestaSeguridad = respuestaSeguridad;
    }

    public Usuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getRespuestaSeguridad() {
        return respuestaSeguridad;
    }

    public void setRespuestaSeguridad(String respuestaSeguridad) {
        this.respuestaSeguridad = respuestaSeguridad;
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
