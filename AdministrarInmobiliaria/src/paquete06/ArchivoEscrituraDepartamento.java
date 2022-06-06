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



public final class ArchivoEscrituraDepartamento {

    private Departamento registroDepartamento;
    private ObjectOutputStream salida;
    private ArrayList<Departamento> listaDepartamentos;
    private String nombreArchivo;

    public ArchivoEscrituraDepartamento(String nomArchivo) {
        this.listaDepartamentos = new ArrayList<>();
        nombreArchivo = nomArchivo;
        establecerListaDepartamento();
        try // abre el archivo
        {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            // proceso para ingresar nuevamente los valores del archivo
            if (obtenerListaDepartamentos().size() > 0) {
                for (int i = 0; i < obtenerListaDepartamentos().size(); i++) {
                    establecerRegistroDepartamento(obtenerListaDepartamentos().get(i));
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

    public void establecerRegistroDepartamento(Departamento b) {
        registroDepartamento = b;
    }

    public Departamento obtenerRegistroDepartamento() {
        return registroDepartamento;
    }

    public void establecerSalida() {
        try {
            salida.writeObject(registroDepartamento);

        } catch (IOException ioe) {
            System.out.println("Error en escribir archivo");
        }
    }

    public ObjectOutputStream obtenerSalida() {
        return salida;
    }

    public void establecerListaDepartamento() {
       ArchivoLecturaDepartamento l
                = new ArchivoLecturaDepartamento(obtenerNombreArchivo());
        l.establecerDepartamentos();
        listaDepartamentos = l.obtenerDepartamentos();

    }

    public ArrayList<Departamento> obtenerListaDepartamentos() {
        return listaDepartamentos;
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