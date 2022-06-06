/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

// Uso de la clase Formatter para escribir datos en un archivo de texto.
import java.io.FileOutputStream;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public final class ArchivoEscrituraCasa {

    private Casa registroCasa;
    private ObjectOutputStream salida;
    private ArrayList<Casa> listaCasas;
    private String nombreArchivo;

    public ArchivoEscrituraCasa(String nomArchivo) {
        this.listaCasas = new ArrayList<>();
        nombreArchivo = nomArchivo;
        establecerListaConstructora();
        try // abre el archivo
        {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            // proceso para ingresar nuevamente los valores del archivo
            if (obtenerListaCasas().size() > 0) {
                for (int i = 0; i < obtenerListaCasas().size(); i++) {
                    establecerRegistroCasas(obtenerListaCasas().get(i));
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

    public void establecerRegistroCasas(Casa b) {
        registroCasa = b;
    }

    public Casa obtenerRegistroCasa() {
        return registroCasa;
    }

    public void establecerSalida() {
        try {
            salida.writeObject(registroCasa);

        } catch (IOException ioe) {
            System.out.println("Error en escribir archivo");
        }
    }

    public ObjectOutputStream obtenerSalida() {
        return salida;
    }

    public void establecerListaConstructora() {
        ArchivoLecturaCasa l
                = new ArchivoLecturaCasa(obtenerNombreArchivo());
        l.establecerCasas();
        listaCasas = l.obtenerCasas();

    }

    public ArrayList<Casa> obtenerListaCasas() {
        return listaCasas;
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
