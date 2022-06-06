/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete05;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Constructora  implements Serializable{
     private String constructora;
    private int id;

    public Constructora(String constructora, int id) {
        this.constructora = constructora;
        this.id = id;
    }

 

    public void establecerConstructora(String n) {
        constructora = n;
    }

    public void establecerID(int n) {
        id = n;
    }

    public String obtenerConstructora() {
        return constructora;
    }

    public int obtenerID() {
        return id;
    }
}
