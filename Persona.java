package models;

import java.util.Date;

public class Persona {
    private String nombre;
    private String apellido;
    private int dni;
    private String NombreVacuna;
    private Date fechaAsignada;

    public Persona(String nombre, String apellido, int dni, String nombreVacuna, Date fechaAsignada) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        NombreVacuna = nombreVacuna;
        this.fechaAsignada = fechaAsignada;
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

    public String getNombreVacuna() {
        return NombreVacuna;
    }

    public void setNombreVacuna(String nombreVacuna) {
        NombreVacuna = nombreVacuna;
    }

    public Date getFechaAsignada() {
        return fechaAsignada;
    }

    public void setFechaAsignada(Date fechaAsignada) {
        this.fechaAsignada = fechaAsignada;
    }
}
