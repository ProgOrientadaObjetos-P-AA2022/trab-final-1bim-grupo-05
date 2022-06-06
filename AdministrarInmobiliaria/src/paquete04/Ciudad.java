/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Ciudad implements Serializable{
    private String nombre_ciudad;
    private String provincia;

    public Ciudad(String nombre_ciudad, String provincia) {
        this.nombre_ciudad = nombre_ciudad;
        this.provincia = provincia;
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
    @Override
    public String toString(){
        String c="Ciudad";
        c=String.format("%s\n Nombre Ciudad: %s\n Nombre Provincia: %s\n", c, 
                obtenerNombre(), obtenerProvincia());
        return c;
    }
}

