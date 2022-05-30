/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author reroes
 */
public class Ciudad {
    private String nombre_ciudad;
    private String provincia;

    public Ciudad(String a, String s) {
        nombre_ciudad = a;
        provincia = s;
    }

    public void establecerNombre(String n) {
        nombre_ciudad = n;
    }

    public void establecerProvincia(String n) {
        provincia = n;
    }

    public String obtenerNombre() {
        return nombre_ciudad;
    }

    public String obtenerProvincia() {
        return provincia;
    }
}

