/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

import java.io.Serializable;
import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;

/**
 *
 * @author reroes
 */
public class Casa implements Serializable{

    private Propietario propi;
    private double preM2;
    private double numM2;
    private double cosF;
    private Barrio barrio;
    private Ciudad ciudad;
    private int numC;
    private Constructora constru;

    public Casa(double pM2, double nM2, int num, Propietario p,
            Barrio ba, Ciudad ciu, Constructora c) {

        propi = p;
        preM2 = pM2;
        numM2 = nM2;
        numC = num;
        barrio = ba;
        ciudad = ciu;
        constru = c;

    }

    public void establecerPropietario(Propietario p) {

        propi = p;

    }

    public void establecerPrecioM2(double m2) {

        preM2 = m2;

    }

    public void establecerNumeroM2(double nM2) {

        numM2 = nM2;

    }

    public void calcularCostoFinal() {

        cosF = numM2 * preM2;

    }

    public void establecerBarrio(Barrio ba) {

        barrio = ba;

    }

    public void establecerCiudad(Ciudad ciu) {

        ciudad = ciu;

    }

    public void establecerNumeroCuartos(int num) {

        numC = num;

    }

    public void establecerConstructora(Constructora c) {

        constru = c;

    }

    public Propietario obtenerPropietario() {

        return propi;

    }

    public double obtenerPrecioM2() {

        return preM2;

    }

    public double obtenerNumeroM2() {

        return numM2;

    }

    public double obtenerCostoFinal() {

        return cosF;

    }

    public Barrio obtenerBarrio() {

        return barrio;

    }

    public Ciudad obtenerCiudad() {

        return ciudad;

    }

    public int obtenerNumeroCuartos() {

        return numC;

    }

    public Constructora obtenerConstructora() {

        return constru;

    }
    @Override
    public String toString() {
        
        String cadena = String.format("\tInformacion casa:\n"
                + "Precio metro cuadrado: %.2f \n"
                + "Numero metros Cuadrados: %.2f \n"
                + "Numero Cuartos: %d \n"
                + "Costo final: %.2f\n"
                + "->PROPIETARIO\n"
                + "Nombres: %s \n"
                + "Apellidos: %s \n"
                + "Identificacion: %s\n"
                + "->BARRIO\n"
                + "Nombre barrio: %s \n"
                + "Referencia: %s\n"
                + "->CIUDAD\n"
                + "Nombre Ciudad: %s \n"
                + "Nombre Provincia: %s \n"
                + "CONSTRUCTORA\n"
                + "Nombre Constructora: %s \n"
                + "Id Empresa: %s\n"
                ,preM2, numM2, numC, cosF, propi.obtenerNombre(),propi.obtenerApellidos(),propi.obtenerIdentificacion(),
                barrio.getNombre_Barrio(),barrio.getReferencia(),
                ciudad.obtenerNombre(),ciudad.obtenerProvincia(),
                constru.obtenerConstructora(),constru.obtenerID());
        return cadena;
    }
}


