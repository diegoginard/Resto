
package Entidades;

import java.time.LocalDate;


public class Mozo extends Persona{
    
    private int idMozo;
    private boolean activo;

    public Mozo(int idMozo, String nombre, String apellido, int edad, int dni, String telefono, LocalDate fechaNacimiento, boolean activo) {
        super(nombre, apellido, edad, dni, telefono, fechaNacimiento);
        this.idMozo = idMozo;
        this.activo = activo;
    }

    public Mozo(String nombre, String apellido, int edad, int dni, String telefono, LocalDate fechaNacimiento, boolean activo) {
        super(nombre, apellido, edad, dni, telefono, fechaNacimiento);
        this.activo = activo;
    }
    
     public Mozo() {
    }
    

    public int getIdMozo() {
        return idMozo;
    }

    public void setIdMozo(int idMozo) {
        this.idMozo = idMozo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return getNombre() + " " + getApellido();
    }
    
}
