
package Entidades;


public class Mozo {
    
    private int idMozo;
    private String nombre;
    private String apellido;
    private int dni;
    private int telefono;

    public Mozo() {
    }

    public Mozo(int idMozo, String nombre, String apellido, int dni, int telefono) {
        this.idMozo = idMozo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
    }

    public Mozo(String nombre, String apellido, int dni, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
    }

    public int getIdMozo() {
        return idMozo;
    }

    public void setIdMozo(int idMozo) {
        this.idMozo = idMozo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return nombre + ", " + apellido ;
    }
    
}
