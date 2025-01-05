
package Entidades;

import java.time.LocalDate;


public class Usuario extends Persona {
    
    private int idUsuario;
    private String usuario;
    private String password;
    private boolean activo;

    // Constructor
    public Usuario(int idUsuario, String usuario, String password, String nombre, String apellido, int edad, int dni, int telefono, LocalDate fechaNacimiento, boolean activo) {
        super(nombre, apellido, edad, dni, telefono, fechaNacimiento);
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.password = password;
        this.activo = activo;
    }

    public Usuario(String usuario, String password, String nombre, String apellido, int edad, int dni, int telefono, LocalDate fechaNacimiento, boolean activo) {
        super(nombre, apellido, edad, dni, telefono, fechaNacimiento);
        this.usuario = usuario;
        this.password = password;
        this.activo = activo;
    }

    public Usuario() {
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "Nombre = " + getNombre() + ", Apellido =" + getApellido() + ", Activo =" + activo + '}';
    }

}

  