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
public class Departamento implements Serializable {

    String propietario;
    String apellidos;
    String identificacion;
    String constructora;
    String barrio;
    String referencia;
    String ciudad;

    String provincia;

    double precioMetro;
    double costoFinal;
    int numeroMetros;
    int id;
    double cuotaMensual;

    Propietario pro = new Propietario(propietario, apellidos, identificacion);
    Barrio bar = new Barrio(barrio, referencia);
    Ciudad ciu = new Ciudad(ciudad, provincia);
    Constructora cons = new Constructora(constructora, id);

    public Departamento(String propietario, String apellidos, 
            String identificacion, String constructora, String barrio, 
            String referencia, String ciudad, String provincia, double precioMetro, 
            double costoFinal, int numeroMetros, int id, double cuotaMensual) {
        this.propietario = propietario;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
        this.constructora = constructora;
        this.barrio = barrio;
        this.referencia = referencia;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.precioMetro = precioMetro;
        this.costoFinal = costoFinal;
        this.numeroMetros = numeroMetros;
        this.id = id;
        this.cuotaMensual = cuotaMensual;
    }

    

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setPrecioMetro(double precioMetro) {
        this.precioMetro = precioMetro;
    }

    public void setCostoFinal(double costoFinal) {
        this.costoFinal = costoFinal;
    }

    public void setNumeroMetros(int numeroMetros) {
        this.numeroMetros = numeroMetros;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCuotaMensual(double cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

    public void setPro(Propietario pro) {
        this.pro = pro;
    }

    public void setBar(Barrio bar) {
        this.bar = bar;
    }

    public void setCiu(Ciudad ciu) {
        this.ciu = ciu;
    }

    public void setCons(Constructora cons) {
        this.cons = cons;
    }

    public String getPropietario() {
        return propietario;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getConstructora() {
        return constructora;
    }

    public String getBarrio() {
        return barrio;
    }

    public String getReferencia() {
        return referencia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public double getPrecioMetro() {
        return precioMetro;
    }

    public double getCostoFinal() {
        return costoFinal;
    }

    public int getNumeroMetros() {
        return numeroMetros;
    }

    public int getId() {
        return id;
    }

    public double getCuotaMensual() {
        return cuotaMensual;
    }

    public Propietario getPro() {
        return pro;
    }

    public Barrio getBar() {
        return bar;
    }

    public Ciudad getCiu() {
        return ciu;
    }

    public Constructora getCons() {
        return cons;
    }

}
