/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Barrio implements Serializable{
    private String nombre_Barrio;
    private String referencia;

    public Barrio(String nombre_Barrio, String referencia) {
        this.nombre_Barrio = nombre_Barrio;
        this.referencia = referencia;
    }

    public String getNombre_Barrio() {
        return nombre_Barrio;
    }

    public void setNombre_Barrio(String nombre_Barrio) {
        this.nombre_Barrio = nombre_Barrio;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    
   

    @Override
    public String toString(){
        String b="Barrio";
        b=String.format("%s\n Nombre:%s\n Referencia: %s\n", 
                b,getNombre_Barrio(), getReferencia());
        return b;
    }
}
