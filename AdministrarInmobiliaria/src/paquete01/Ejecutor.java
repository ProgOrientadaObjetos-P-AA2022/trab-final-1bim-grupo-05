/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.ArrayList;
import java.util.Scanner;
import paquete02.ArchivoEscrituraPropietario;
import paquete02.ArchivoLecturaPropietario;
import paquete02.Propietario;
import paquete03.ArchivoEscrituraBarrio;
import paquete03.ArchivoLecturaBarrio;
import paquete03.Barrio;
import paquete04.ArchivoEscrituraCiudad;
import paquete04.ArchivoLecturaCiudad;
import paquete04.Ciudad;
import paquete05.ArchivoEscrituraConstructora;
import paquete05.ArchivoLecturaConstructora;
import paquete05.Constructora;
import paquete06.ArchivoEscrituraCasa;
import paquete06.ArchivoEscrituraDepartamento;
import paquete06.ArchivoLecturaCasa;
import paquete06.ArchivoLecturaDepartamento;
import paquete06.Casa;
import paquete06.Departamento;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {

        System.out.println("------------------------------------------------------------------------");
        System.out.println("\t\t REGISTRO DE DATOS DE UNA INMOBILIARIA");
        System.out.println("------------------------------------------------------------------------");
        menuUno();
    }

    public static void menuUno() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n\n------------------------------------------------------------------------");
        System.out.println("Seleccione una opcion del siguiente menú:\n"
                + "(1) Ingreso de Datos\n"
                + "(2) Creacion departamento-casa\n"
                + "(3) Mostrar listas\n"
                + "(4) Finalizar programa");
        System.out.println("------------------------------------------------------------------------");
        int datos = entrada.nextInt();
        if ((datos <= 0) || (datos > 4)) {
            System.out.print("El numero ingresado no corresponde a ningun item.\nIntente de nuevo");
            menuUno();
        }
        switch (datos) {
            case 1:
                menuDos();
                break;
            case 2:
                menuTres();
                break;
            case 3:
                menuCuatro();
            case 4:
                System.out.println("Programa cancelado por el usuario");
                break;
        }
    }

    public static void menuDos() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n\n------------------------------------------------------------------------");
        System.out.println("Seleccione una opcion del siguiente menú: \n"
                + "(1) Datos de Propietario\n"
                + "(2) Datos de Barrios\n"
                + "(3) Datos de Ciudad\n"
                + "(4) Datos de Constructora\n"
                + "(5) Regresar");
        System.out.println("------------------------------------------------------------------------");
        int datos = entrada.nextInt();
        if ((datos <= 0) || (datos > 5)) {
            System.out.print("El numero ingresado no corresponde a ningun item.\nIntente de nuevo");
            menuDos();
        }
        switch (datos) {
            case 1:
                propietario();
                break;
            case 2:
                barrio();
                break;
            case 3:
                ciudad();
                break;
            case 4:
                constructora();
                break;
            case 5:
                menuUno();
                break;
        }
    }

    public static void menuTres() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n\n------------------------------------------------------------------------");
        System.out.println("Seleccione una opcion del siguiente menú: \n"
                + "(1) Casa\n"
                + "(2) Departamento\n"
                + "(3) Regresar");
        System.out.println("------------------------------------------------------------------------");
        int datos = entrada.nextInt();
        if ((datos <= 0) || (datos > 3)) {
            System.out.print("El numero ingresado no corresponde a ningun item.\nIntente de nuevo");
            menuTres();
        }
        switch (datos) {
            case 1:
                casa();
                break;
            case 2:
                departamento();
                break;
            case 3:
                menuUno();
                break;
        }
    }

    public static void menuCuatro() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("\n\n------------------------------------------------------------------------");
        System.out.println("Seleccione una opcion del siguiente menú\n"
                + "(1) Mostrar lista propietarios: \n"
                + "(2) Mostrar lista barrios: \n"
                + "(3) Mostrar lista ciudades: \n"
                + "(4) Mostrar lista constructoras: \n"
                + "(5) Mostrar lista casas: \n"
                + "(6) Mostrar lista departamentos: \n"
                + "(7) Regresar\n");
        System.out.println("------------------------------------------------------------------------");
        int datos = entrada.nextInt();
        switch (datos) {
            case 1:
                ArchivoLecturaPropietario lecturap = new ArchivoLecturaPropietario("datos/propietarios.dat");
                lecturap.establecerPropietarios();
                System.out.printf("%s", lecturap.toString());
                lecturap.cerrarArchivo();
                menuCuatro();
                break;
            case 2:
                ArchivoLecturaBarrio lecturab = new ArchivoLecturaBarrio("datos/barrios.dat");
                lecturab.establecerBarrios();
                System.out.printf("%s", lecturab.toString());
                lecturab.cerrarArchivo();
                menuCuatro();
                break;
            case 3:
                ArchivoLecturaCiudad lecturaciu = new ArchivoLecturaCiudad("datos/ciudades.dat");
                lecturaciu.establecerCiudades();
                System.out.printf("%s", lecturaciu.toString());
                lecturaciu.cerrarArchivo();
                menuCuatro();
                break;
            case 4:
                ArchivoLecturaConstructora lecturacons = new ArchivoLecturaConstructora("datos/constructoras.dat");
                lecturacons.establecerConstructora();
                System.out.printf("%s", lecturacons.toString());
                lecturacons.cerrarArchivo();
                menuCuatro();
                break;
            case 5:
                ArchivoLecturaCasa lecturac = new ArchivoLecturaCasa("datos/casas.dat");
                lecturac.establecerCasas();
                System.out.printf("%s", lecturac.toString());
                lecturac.cerrarArchivo();
                menuCuatro();
                break;

            case 6:
                ArchivoLecturaDepartamento lecturad = new ArchivoLecturaDepartamento("datos/departamento.dat");
                lecturad.establecerDepartamentos();
                System.out.printf("%s", lecturad.toString());
                lecturad.cerrarArchivo();
                menuCuatro();
                break;

            case 7:
                menuUno();
                break;

        }
    }

    public static void propietario() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingreso de propietario");
        System.out.println("Ingrese los nombres del propietario");
        String nombre = entrada.nextLine();

        System.out.println("Ingrese los apellidos de propietario");
        String apellidos = entrada.nextLine();

        System.out.println("Ingrese la cedula del propietario");
        String cedula = entrada.nextLine();

        Propietario propietario = new Propietario(nombre, apellidos, cedula);
        ArchivoEscrituraPropietario esc_prop = new ArchivoEscrituraPropietario("datos/propietarios.dat");
        System.out.println(propietario);
        esc_prop.establecerRegistroPropietario(propietario);
        esc_prop.establecerSalida();
        System.out.println("propietario ingresado correctamente");
        menuDos();
    }

    public static void barrio() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingreso de Barrios");
        System.out.println("Ingrese el nombre del barrio");
        String nombreB = entrada.nextLine();
        System.out.println("Ingrese la referencia del barrio");
        String referencia = entrada.nextLine();
        Barrio barrio = new Barrio(nombreB, referencia);
        ArchivoEscrituraBarrio esc_barrio = new ArchivoEscrituraBarrio("datos/barrios.dat");
        System.out.println(barrio);
        esc_barrio.establecerRegistroBarrio(barrio);
        esc_barrio.establecerSalida();
        System.out.println("barrio ingresado correctamente");
        menuDos();
    }

    public static void ciudad() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingreso de Ciudades");
        System.out.println("Ingrese el nombre de la ciudad");
        String nombreCi = entrada.nextLine();
        System.out.println("Ingrese el nombre de la provincia");
        String prov = entrada.nextLine();
        Ciudad ciudad = new Ciudad(nombreCi, prov);
        ArchivoEscrituraCiudad esc_ciudad = new ArchivoEscrituraCiudad("datos/ciudades.dat");
        System.out.println(ciudad);
        esc_ciudad.establecerRegistroCiudad(ciudad);
        esc_ciudad.establecerSalida();
        System.out.println("ciudad ingresada correctamente");
        menuDos();
    }

    public static void constructora() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingreso de constructoras");
        System.out.println("Ingrese el nombre de la constructora");
        String nombreC = entrada.nextLine();
        System.out.println("Ingrese el ID de la empresa");
        String id = entrada.nextLine();
        Constructora constructora = new Constructora(nombreC, 0);
        ArchivoEscrituraConstructora esc_cons = new ArchivoEscrituraConstructora("datos/constructoras.dat");
        System.out.println(constructora);
        esc_cons.establecerRegistroConstructora(constructora);
        esc_cons.establecerSalida();
        System.out.println("propietarios ingresados correctamente");
        menuDos();
    }

    public static void casa() {
        Scanner entrada = new Scanner(System.in);
        Propietario propietario = encontrarPropietarioBuscado();
        Barrio barrio = encontrarBarrioBuscado();
        Ciudad ciudad = encontrarCiudadBuscada();
        Constructora constructora = encontrarConstructoraBuscada();
        System.out.println("Ingreso de Casa");
        System.out.println("Ingrese el valor del metro cuadrado: ");
        double precioM2 = entrada.nextDouble();
        System.out.println("Ingrese el númmero de metros cuadrados de la casa: ");
        double m2 = entrada.nextDouble();
        System.out.println("Ingrese el número de cuartos de la casa: ");
        int numCuartos = entrada.nextInt();
        Casa casa = new Casa(precioM2, m2, numCuartos, propietario, barrio, ciudad, constructora);
        casa.calcularCostoFinal();
        
        ArchivoEscrituraCasa archivoCasa = new ArchivoEscrituraCasa("datos/casas.dat");
        archivoCasa.establecerRegistroCasas(casa);
        archivoCasa.establecerSalida();

        System.out.println("Casa ingresados correctamente");

        System.out.printf("\n %s \n", casa);
        menuTres();
    }

    public static void departamento() {
        Scanner entrada = new Scanner(System.in);
        Propietario propietario = encontrarPropietarioBuscado();
        Barrio barrio = encontrarBarrioBuscado();
        Ciudad ciudad = encontrarCiudadBuscada();
        Constructora constructora = encontrarConstructoraBuscada();
        System.out.println("Ingreso de Departamento");
        System.out.println("Ingrese el valor del metro cuadrado: ");
        double precioM2 = entrada.nextDouble();
        System.out.println("Ingrese el númmero de metros cuadrados del departamento: ");
        double m2 = entrada.nextDouble();
        System.out.println("Ingrese el valor AliCuota mensual: ");
        double valAlicuota = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("Ingrese el nombre del edificio: ");
        String nomEdificio = entrada.nextLine();
        System.out.println("Ingrese la ubicación del edificio: ");
        String ubiEdificio = entrada.nextLine();
        Departamento departamento = new Departamento(ubiEdificio, ubiEdificio, ubiEdificio, nomEdificio, ubiEdificio, ubiEdificio, ubiEdificio, ubiEdificio, precioM2, precioM2, 0, 0, valAlicuota);
        departamento.setCostoFinal(precioM2);
        ArchivoEscrituraDepartamento escrituraDepar = new ArchivoEscrituraDepartamento("datos/departamento.dat");
        escrituraDepar.establecerRegistroDepartamento(departamento);
        escrituraDepar.establecerSalida();
        System.out.println("Departamento ingresado correctamente");

        System.out.printf("\n %s \n", departamento);

        menuTres();
    }

    public static Propietario encontrarPropietarioBuscado() {
        Scanner entrada = new Scanner(System.in);
        String identificacion;
        String nombres;
        String apellidos;
        String nombreArchivo = "datos/propietarios.dat";
        ArchivoEscrituraPropietario esc_prop = new ArchivoEscrituraPropietario(nombreArchivo);
        System.out.println("Ingrese identificacion del propietario: ");
        identificacion = entrada.nextLine();
        Propietario propietarioEncontrado;
        ArchivoLecturaPropietario lectura = new ArchivoLecturaPropietario(nombreArchivo);
        lectura.establecerIdentificador(identificacion);
        lectura.establecerPropietarioBuscado();
        propietarioEncontrado = lectura.obtenerPropietarioBuscado();

        if (propietarioEncontrado != null) {
            System.out.printf("Propietario encontrado %s\n", propietarioEncontrado);
            return propietarioEncontrado;
        } else {
            System.out.println("Propietario ingresado no se encontró.Ingrese nuevo propietario");
            System.out.println("Ingrese nombres del propietario: ");
            nombres = entrada.nextLine();
            System.out.println("Ingrese apellidos del propietario: ");
            apellidos = entrada.nextLine();
            System.out.println("Reingrese identificacion del propietario: ");
            identificacion = entrada.nextLine();
            Propietario propietario = new Propietario(nombres, apellidos, identificacion);
            ArchivoEscrituraPropietario archivop = new ArchivoEscrituraPropietario(nombreArchivo);
            archivop.establecerRegistroPropietario(propietario);
            archivop.establecerSalida();
            return propietario;
        }
    }

    public static Barrio encontrarBarrioBuscado() {
        Scanner entrada = new Scanner(System.in);
        String nombreBarrio;
        String referencia;
        String nombreArchivo = "datos/barrios.dat";
        ArchivoEscrituraBarrio escr_barrio = new ArchivoEscrituraBarrio(nombreArchivo);
        System.out.println("Ingrese nombre del barrio: ");
        nombreBarrio = entrada.nextLine();
        Barrio barrioEncontrado;
        ArchivoLecturaBarrio lecturaB = new ArchivoLecturaBarrio(nombreArchivo);
        lecturaB.establecerIdentificador(nombreBarrio);
        lecturaB.establecerBarrioBuscado();
        barrioEncontrado = lecturaB.obtenerBarrioBuscado();
        if (barrioEncontrado != null) {
            System.out.printf("Barrio encontrado %s\n", barrioEncontrado);
            return barrioEncontrado;
        } else {
            System.out.println("Barrio ingresado no se encontró.Ingrese nuevo barrio");
            System.out.println("Reingrese nombre del barrio: ");
            nombreBarrio = entrada.nextLine();
            System.out.println("Ingrese referencia: ");
            referencia = entrada.nextLine();
            Barrio barrio = new Barrio(nombreBarrio, referencia);
            ArchivoEscrituraBarrio esc_barrio = new ArchivoEscrituraBarrio(nombreArchivo);
            esc_barrio.establecerRegistroBarrio(barrio);
            esc_barrio.establecerSalida();
            return barrio;
        }
    }

    public static Ciudad encontrarCiudadBuscada() {
        Scanner entrada = new Scanner(System.in);
        String nombreCiudad;
        String nombreProvincia;
        String nombreArchivo = "datos/ciudades.dat";
        ArchivoEscrituraCiudad esc_ciudad = new ArchivoEscrituraCiudad(nombreArchivo);
        System.out.println("Ingrese nombre ciudad: ");
        nombreCiudad = entrada.nextLine();
        Ciudad ciudadEncontrada;
        ArchivoLecturaCiudad lecturaC = new ArchivoLecturaCiudad(nombreArchivo);
        lecturaC.establecerIdentificador(nombreCiudad);
        lecturaC.establecerCiudadBuscado();
        ciudadEncontrada = lecturaC.obtenerCiudadBuscado();
        if (ciudadEncontrada != null) {
            System.out.printf("Ciudad encontrada %s\n", ciudadEncontrada);
            return ciudadEncontrada;
        } else {
            System.out.println("Ciudad ingresada no se encontró.Ingrese nueva ciudad");
            System.out.println("Reingrese nombre de la ciudad: ");
            nombreCiudad = entrada.nextLine();
            System.out.println("Ingrese nombre de la provincia: ");
            nombreProvincia = entrada.nextLine();
            Ciudad ciudad = new Ciudad(nombreCiudad, nombreProvincia);
            ArchivoEscrituraCiudad archivociu = new ArchivoEscrituraCiudad(nombreArchivo);
            archivociu.establecerRegistroCiudad(ciudad);
            archivociu.establecerSalida();
            return ciudad;
        }
    }

    public static Constructora encontrarConstructoraBuscada() {
        Scanner entrada = new Scanner(System.in);
        String nombreConstructora;
        int idEmpresa;
        String nombreArchivo = "datos/constructoras.dat";
        ArchivoEscrituraConstructora esc_cons = new ArchivoEscrituraConstructora(nombreArchivo);
        System.out.println("Ingrese id de la constructora: ");
        idEmpresa = entrada.nextInt();
        entrada.nextLine();
        Constructora constructoraEncontrada;
        ArchivoLecturaConstructora lecturaCons = new ArchivoLecturaConstructora(nombreArchivo);
        lecturaCons.establecerIdentificador(idEmpresa);
        lecturaCons.establecerConstructoraBuscado();
        constructoraEncontrada = lecturaCons.obtenerConstructoraBuscado();
        if (constructoraEncontrada != null) {
            System.out.printf("Constructora encontrada %s\n", constructoraEncontrada);
            return constructoraEncontrada;
        } else {
            System.out.println("Constructora ingresada no se encontró.Intente ingresar el dato de nuevo");
            System.out.println("Ingrese nombre constructora: ");
            nombreConstructora = entrada.nextLine();
            System.out.println("Reingrese id constructora: ");
            idEmpresa = entrada.nextInt();
            Constructora constru = new Constructora(nombreConstructora,idEmpresa);
                 ArchivoEscrituraConstructora archivoco = new ArchivoEscrituraConstructora(nombreArchivo);
            archivoco.establecerRegistroConstructora(constru);
            archivoco.establecerSalida(); 
                    return constru;
        
        }
    }

}
