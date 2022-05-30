/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;

/**
 *
 * @author reroes
 */
public class Casa {
    String propietario;
    String apellidos;
    String identificacion;
    String constructora;
    String barrio;
    String referencia;
    String ciudad;
    String edificio;
    String ubicacion;
    String provincia ;
    
    
    int numeroMetros;
    double costoFinal;
    double precioMetro;
    int id;
    double cuotaMensual;
    int numeroCuartos;

    
    
    Propietario pro = new Propietario(propietario, apellidos, identificacion);
    Barrio bar = new Barrio(barrio, referencia);
    Ciudad ciu = new Ciudad(ciudad, provincia);
    Constructora cons = new Constructora(constructora, id);
}
