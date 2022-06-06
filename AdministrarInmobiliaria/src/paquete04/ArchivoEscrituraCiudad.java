/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

// Uso de la clase Formatter para escribir datos en un archivo de texto.



import java.io.FileOutputStream;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;



public final class ArchivoEscrituraCiudad {

    private Ciudad registroCiudad;
    private ObjectOutputStream salida;
    private ArrayList<Ciudad> listaCiudades;
    private String nombreArchivo;

    public ArchivoEscrituraCiudad(String nomArchivo) {
        this.listaCiudades = new ArrayList<>();
        nombreArchivo = nomArchivo;
        establecerListaCiudad();
        try // abre el archivo
        {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            // proceso para ingresar nuevamente los valores del archivo
            if (obtenerListaCiudades().size() > 0) {
                for (int i = 0; i < obtenerListaCiudades().size(); i++) {
                    establecerRegistroCiudad(obtenerListaCiudades().get(i));
                    establecerSalida();
                }
            }
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al abrir el archivo.");
        } // fin de catch
    }

    public void establecerNombreArchivo(String c) {
        nombreArchivo = c;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public void establecerRegistroCiudad(Ciudad b) {
        registroCiudad = b;
    }

    public Ciudad obtenerRegistroCiudad() {
        return registroCiudad;
    }

    public void establecerSalida() {
        try {
            salida.writeObject(registroCiudad);

        } catch (IOException ioe) {
            System.out.println("Error en escribir archivo");
        }
    }

    public ObjectOutputStream obtenerSalida() {
        return salida;
    }

    public void establecerListaCiudad() {
       ArchivoLecturaCiudad l
                = new ArchivoLecturaCiudad(obtenerNombreArchivo());
        l.establecerCiudades();
        listaCiudades = l.obtenerCiudades();

    }

    public ArrayList<Ciudad> obtenerListaCiudades() {
        return listaCiudades;
    }

    public void cerrarArchivo() {
        try // cierra el archivo
        {
            if (salida != null) {
                salida.close();
            }
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");

        } // fin de catch
    }
}