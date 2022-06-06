/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete05;

// Uso de la clase Formatter para escribir datos en un archivo de texto.




import java.io.FileOutputStream;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;



public final class ArchivoEscrituraConstructora {

    private Constructora registroConstructora;
    private ObjectOutputStream salida;
    private ArrayList<Constructora> listaConstructoras;
    private String nombreArchivo;

    public ArchivoEscrituraConstructora(String nomArchivo) {
        this.listaConstructoras = new ArrayList<>();
        nombreArchivo = nomArchivo;
        establecerListaConstructora();
        try // abre el archivo
        {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            // proceso para ingresar nuevamente los valores del archivo
            if (obtenerListaConstructoras().size() > 0) {
                for (int i = 0; i < obtenerListaConstructoras().size(); i++) {
                    establecerRegistroConstructora(obtenerListaConstructoras().get(i));
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

    public void establecerRegistroConstructora(Constructora b) {
        registroConstructora = b;
    }

    public Constructora obtenerRegistroConstructora() {
        return registroConstructora;
    }

    public void establecerSalida() {
        try {
            salida.writeObject(registroConstructora);

        } catch (IOException ioe) {
            System.out.println("Error en escribir archivo");
        }
    }

    public ObjectOutputStream obtenerSalida() {
        return salida;
    }

    public void establecerListaConstructora() {
       ArchivoLecturaConstructora l
                = new ArchivoLecturaConstructora(obtenerNombreArchivo());
        l.establecerConstructora();
        listaConstructoras = l.obtenerConstructoras();

    }

    public ArrayList<Constructora> obtenerListaConstructoras() {
        return listaConstructoras;
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