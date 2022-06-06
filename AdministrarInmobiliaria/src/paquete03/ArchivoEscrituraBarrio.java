/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

// Uso de la clase Formatter para escribir datos en un archivo de texto.


import java.io.FileOutputStream;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;



public final class ArchivoEscrituraBarrio {

    private Barrio registroBarrio;
    private ObjectOutputStream salida;
    private ArrayList<Barrio> listaBarrio = new ArrayList<>();
    private String nombreArchivo;

    public ArchivoEscrituraBarrio(String nomArchivo) {
        nombreArchivo = nomArchivo;
        establecerListaBarrios();
        try // abre el archivo
        {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            // proceso para ingresar nuevamente los valores del archivo
            if (obtenerListaBarrios().size() > 0) {
                for (int i = 0; i < obtenerListaBarrios().size(); i++) {
                    establecerRegistroBarrio(obtenerListaBarrios().get(i));
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

    public void establecerRegistroBarrio(Barrio b) {
        registroBarrio = b;
    }

    public Barrio obtenerRegistroBarrio() {
        return registroBarrio;
    }

    public void establecerSalida() {
        try {
            salida.writeObject(registroBarrio);

        } catch (IOException ioe) {
            System.out.println("Error en escribir archivo");
        }
    }

    public ObjectOutputStream obtenerSalida() {
        return salida;
    }

    public void establecerListaBarrios() {
       ArchivoLecturaBarrio l
                = new ArchivoLecturaBarrio(obtenerNombreArchivo());
        l.establecerBarrios();
        listaBarrio = l.obtenerBarrios();

    }

    public ArrayList<Barrio> obtenerListaBarrios() {
        return listaBarrio;
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