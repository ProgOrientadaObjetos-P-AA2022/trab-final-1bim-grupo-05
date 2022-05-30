/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete05;

/**
 *
 * @author reroes
 */
public class Constructora {
     private String constructora;
    private int id;

    public Constructora(String a, int s) {
        constructora = a;
        id = s;
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
