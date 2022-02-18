/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruleta;

import java.util.Date;

/**
 * Codigo practico, GUI y Ficheros.
 * Universidad Catolica Santiago de Guayaquil.
 * @author PC
 */
public class Persona {
    private String cedula;
    private String nombre;
    private Date fechaDeNacimiento;

    public Persona(String cedula, String nombre, Date fechaDeNacimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    @Override
    public String toString() {
        return "Persona: "+cedula+" - "+nombre+" - "+fechaDeNacimiento;
    }
    
    
    
    
    
    
    
    
}
