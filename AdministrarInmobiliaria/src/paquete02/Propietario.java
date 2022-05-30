/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public class Propietario {

    private String nombrePropietario;
    private String identificacion;
    private String apellidos;
   
    public Propietario(String a, String s, String d) {
        nombrePropietario = a;
        apellidos = s;
        identificacion = d;
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
}
