/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

// Uso de la clase Formatter para escribir datos en un archivo de texto.

import java.io.FileOutputStream;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;



public final class ArchivoEscrituraPropietario {

    private String nombreArchivo;
    private Propietario registroPropietario;
    private ObjectOutputStream salida;
    private ArrayList<Propietario> listaPropietario = new ArrayList<>();

    public ArchivoEscrituraPropietario(String nameData) {
        nombreArchivo = nameData;

        establecerListaPropietarios(); // obtener los valores (objetos)
        // que tiene el archivo.
        try // abre el archivo
        {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            // proceso para ingresar nuevamente los valores del archivo
            if (obtenerListaPropietarios().size() > 0) {
                for (int i = 0; i < obtenerListaPropietarios().size(); i++) {
                    establecerRegistroPropietario(obtenerListaPropietarios().get(i));
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

    public void establecerRegistroPropietario(Propietario p) {
        registroPropietario = p;
    }

    public Propietario obtenerRegistroPropietario() {
        return registroPropietario;
    }

    public void establecerSalida() {
        try {
            salida.writeObject(registroPropietario);

        } catch (IOException ioe) {
            System.out.println("Error en escribir archivo");
        }
    }

    public ObjectOutputStream obtenerSalida() {
        return salida;
    }

    public void establecerListaPropietarios() {
           ArchivoLecturaPropietario l = 
                new ArchivoLecturaPropietario(obtenerNombreArchivo());
        l.establecerPropietarios();
        listaPropietario = l.obtenerPropietarios();

    }

    public ArrayList<Propietario> obtenerListaPropietarios() {
        return listaPropietario;
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