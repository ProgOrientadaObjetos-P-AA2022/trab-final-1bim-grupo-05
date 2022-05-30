/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

/**
 *
 * @author reroes
 */
public class Barrio {
    private String nombre_Barrio;
    private String referencia;
    
   
    public Barrio(String a, String s) {
        nombre_Barrio = a;
        referencia = s;
        
    }

    public void establecerNombreBarrio(String n) {
        nombre_Barrio = n;
    }

    public void establecerReferencia(String n) {
        referencia = n;
    }

    
    public String obtenerNombreBarrio() {
        return nombre_Barrio;
    }

    public String obtenerReferencia() {
        return referencia;
    }

    
}
