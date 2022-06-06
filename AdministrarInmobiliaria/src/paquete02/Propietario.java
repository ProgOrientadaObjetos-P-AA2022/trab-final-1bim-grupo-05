/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Propietario implements Serializable {

    private String nombrePropietario;
    private String identificacion;
    private String apellidos;

    public Propietario(String nombrePropietario, String identificacion, String apellidos) {
        this.nombrePropietario = nombrePropietario;
        this.identificacion = identificacion;
        this.apellidos = apellidos;
    }

    public void establecerNombre(String n) {
        nombrePropietario = n;
    }

    public void establecerApellidos(String n) {
        apellidos = n;
    }

    public void establecerIdentificacion(String n) {
        identificacion = n;
    }

    public String obtenerNombre() {
        return nombrePropietario;
    }

    public String obtenerApellidos() {
        return apellidos;
    }

    public String obtenerIdentificacion() {
        return identificacion;

    }

    @Override
    public String toString() {
        String p = "Propietario";
        p = String.format("%s\n Nombre: %s\n Apellido: %s\n Identificacion: %s\n", p, obtenerNombre(),
                obtenerApellidos(), obtenerIdentificacion());
        return p;
    }
}
