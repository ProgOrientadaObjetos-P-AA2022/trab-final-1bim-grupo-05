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

       
        System.out.println("\t\tINMOBILIARIA");
        
        menuPrincipal();
    }

    public static void menuPrincipal() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n\n------------------------------------------------------------------------");
        System.out.println("Seleccione una opcion del siguiente menú:\n"
                + " Ingreso de Datos de usuario (1)\n"
                + " Ingreso de departamento o casa (2)\n"
                + " Mostrar registros(3)\n"
                + " Salir(4)");
        System.out.println("------------------------------------------------------------------------");
        int datos = entrada.nextInt();
        if ((datos <= 0) || (datos > 4)) {
            System.out.print("Valor no se encuentra dentro del parametro.\nvuelva a ingresar un valor");
            menuPrincipal();
        }
        switch (datos) {
            case 1:
                menuDatosUsuario();
                break;
            case 2:
                menuCreacionDepartamento_Casa();
                break;
            case 3:
                menuRegistro();
            case 4:
                System.out.println("Programa cancelado por el usuario");
                break;
        }
    }

    public static void menuDatosUsuario() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n\n------------------------------------------------------------------------");
        System.out.println("Seleccione: \n"
                + "Ingresar datos propietario (1) \n"
                + "Ingresar barrios (2)\n"
                + "Ingresar Ciudad (3) \n"
                + "Ingresar Constructora(4)\n"
                + "Regresar a menu principal");
        System.out.println("------------------------------------------------------------------------");
        int datos = entrada.nextInt();
        if ((datos <= 0) || (datos > 5)) {
            System.out.print("Valor incorrecto.\nVuelva a ingresar un valor correcto");
            menuDatosUsuario();
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
                menuPrincipal();
                break;
        }
    }

    public static void menuCreacionDepartamento_Casa() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n\n------------------------------------------------------------------------");
        System.out.println("Seleccione: \n"
                + "Creacion de casa         (1)\n"
                + "Creacion de departamento (2)\n"
                + "Regresar al menu principal (3)");
        System.out.println("==============================================================================");
        int datos = entrada.nextInt();
        if ((datos <= 0) || (datos > 3)) {
            System.out.print("Valor incorrecto.\nVuelva a ingresar un valor correcto");
            menuCreacionDepartamento_Casa();
        }
        switch (datos) {
            case 1:
                casa();
                break;
            case 2:
                departamento();
                break;
            case 3:
                menuPrincipal();
                break;
        }
    }

    public static void menuRegistro() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("\n\n------------------------------------------------------------------------");
        System.out.println("Seleccione:\n"
                + "Mostrar registro propietarios(1): \n"
                + "Mostrar registo barrios(2): \n"
                + "Mostrar registro ciudades(3): \n"
                + "Mostrar registro constructoras(4): \n"
                + "Mostrar registro casas(5): \n"
                + "Mostrar registro departamentos(6): \n"
                + "Volver al menu principal:\n");
        System.out.println("------------------------------------------------------------------------");
        int datos = entrada.nextInt();
        switch (datos) {
            case 1:
                ArchivoLecturaPropietario lecturapro = new ArchivoLecturaPropietario("datos/propietarios.dat");
                lecturapro.establecerPropietarios();
                System.out.printf("%s", lecturapro.toString());
                menuRegistro();
                lecturapro.cerrarArchivo();
                
                menuPrincipal();
                break;
            case 2:
                ArchivoLecturaBarrio lecturab = new ArchivoLecturaBarrio("datos/barrios.dat");
                lecturab.establecerBarrios();
                System.out.printf("%s", lecturab.toString());
                menuRegistro();
                lecturab.cerrarArchivo();
                
                menuPrincipal();
                break;
            case 3:
                ArchivoLecturaCiudad lecturaciu = new ArchivoLecturaCiudad("datos/ciudades.dat");
                lecturaciu.establecerCiudades();
                System.out.printf("%s", lecturaciu.toString());
                menuRegistro();
                lecturaciu.cerrarArchivo();
                menuPrincipal();
                break;
            case 4:
                ArchivoLecturaConstructora lecturacons = new ArchivoLecturaConstructora("datos/constructoras.dat");
                lecturacons.establecerConstructora();
                System.out.printf("%s", lecturacons.toString());
                menuRegistro();
                lecturacons.cerrarArchivo();
                menuPrincipal();
                break;
            case 5:
                ArchivoLecturaCasa lecturac = new ArchivoLecturaCasa("datos/casas.dat");
                lecturac.establecerCasas();
                System.out.printf("%s", lecturac.toString());
                menuRegistro();
                lecturac.cerrarArchivo();
                menuPrincipal();
                break;

            case 6:
                ArchivoLecturaDepartamento lecturad = new ArchivoLecturaDepartamento("datos/departamento.dat");
                lecturad.establecerDepartamentos();
                System.out.printf("%s", lecturad.toString());
                menuRegistro();
                lecturad.cerrarArchivo();
                menuPrincipal();
                break;

            case 7:
                menuPrincipal();
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
        ArchivoEscrituraPropietario escribirPropietario = new ArchivoEscrituraPropietario("datos/propietarios.dat");
        System.out.println(propietario);
        escribirPropietario.establecerRegistroPropietario(propietario);
        escribirPropietario.establecerSalida();
        System.out.println("propietario ingresado correctamente");
        menuDatosUsuario();
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
        menuDatosUsuario();
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
        menuDatosUsuario();
    }

    public static void constructora() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("--------------------------------------------------");
        System.out.println("\t\t CONSTRUCTORA");
        System.out.println("--------------------------------------------------");   
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
        menuDatosUsuario();
    }

    public static void casa() {
        Scanner entrada = new Scanner(System.in);
        Propietario propietario = encontrarPropietarioBuscado();
        Barrio barrio = encontrarBarrioBuscado();
        Ciudad ciudad = encontrarCiudadBuscada();
        Constructora constructora = encontrarConstructoraBuscada();
        System.out.println("--------------------------------------------------");
        System.out.println("\t\t CASA");
        System.out.println("--------------------------------------------------");
        System.out.println("Ingrese el valor del metro cuadrado: ");
        double precioMetro = entrada.nextDouble();
        System.out.println("Ingrese el númmero de metros cuadrados de la casa: ");
        double metroCua = entrada.nextDouble();
        System.out.println("Ingrese el número de cuartos de la casa: ");
        int numCuartos = entrada.nextInt();
        Casa casa = new Casa(precioMetro, metroCua, numCuartos, propietario, barrio, ciudad, constructora);
        casa.calcularCostoFinal();
        
        ArchivoEscrituraCasa archivoCasa = new ArchivoEscrituraCasa("datos/casas.dat");
        archivoCasa.establecerRegistroCasas(casa);
        archivoCasa.establecerSalida();

        System.out.println("Casa ingresados correctamente");

        System.out.printf("\n %s \n", casa);
        menuCreacionDepartamento_Casa();
    }

    public static void departamento() {
        Scanner entrada = new Scanner(System.in);
        Propietario propietario = encontrarPropietarioBuscado();
        Barrio barrio = encontrarBarrioBuscado();
        Ciudad ciudad = encontrarCiudadBuscada();
        Constructora constructora = encontrarConstructoraBuscada();
        System.out.println("--------------------------------------------------");
        System.out.println("\t\tDEPARTAMENTO");
        System.out.println("--------------------------------------------------");
        System.out.println("Ingrese el valor del metro cuadrado: ");
        double precioMetro = entrada.nextDouble();
        System.out.println("Ingrese el númmero de metros cuadrados del departamento: ");
        double metroCua = entrada.nextDouble();
        System.out.println("Ingrese el valor AliCuota mensual: ");
        double valAlicuota = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("Ingrese el nombre del edificio: ");
        String nomEdificio = entrada.nextLine();
        System.out.println("Ingrese la ubicación del edificio: ");
        String ubiEdificio = entrada.nextLine();
        Departamento departamento = new Departamento(ubiEdificio, ubiEdificio, ubiEdificio, nomEdificio, ubiEdificio, ubiEdificio, ubiEdificio, ubiEdificio, precioMetro, precioMetro, 0, 0, valAlicuota);
        departamento.setCostoFinal(precioMetro);
        ArchivoEscrituraDepartamento escrituraDepar = new ArchivoEscrituraDepartamento("datos/departamento.dat");
        escrituraDepar.establecerRegistroDepartamento(departamento);
        escrituraDepar.establecerSalida();
        System.out.println("Departamento ingresado correctamente");

        System.out.printf("\n %s \n", departamento);

        menuCreacionDepartamento_Casa();
    }

    public static Propietario encontrarPropietarioBuscado() {
        Scanner entrada = new Scanner(System.in);
        String identificacion;
        String nombres;
        String apellidos;
        String nombreArchivo = "datos/propietarios.dat";
        ArchivoEscrituraPropietario escribirPropietario = new ArchivoEscrituraPropietario(nombreArchivo);
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
            System.out.println("Propietario ingresado no encontrado."
                    + "\n-----------------------\nIngrese nuevo propietario"
                    + "\n-------------------------------------");
            System.out.println("Ingrese nombres: ");
            nombres = entrada.nextLine();
            System.out.println("Ingrese apellidos: ");
            apellidos = entrada.nextLine();
            System.out.println("Ingrese ID: ");
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
        ArchivoEscrituraBarrio escribirBarrio = new ArchivoEscrituraBarrio(nombreArchivo);
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
            System.out.println("Barrio ingresado no encontrado."
                    + "\n-----------------------\nIngrese nuevo barrio"
                    + "\n-------------------------------------");
            System.out.println("Nombre del barrio: ");
            nombreBarrio = entrada.nextLine();
            System.out.println("Ingrese referencia: ");
            referencia = entrada.nextLine();
            Barrio barrio = new Barrio(nombreBarrio, referencia);
            ArchivoEscrituraBarrio esc_barrio = new ArchivoEscrituraBarrio(nombreArchivo);
            escribirBarrio.establecerRegistroBarrio(barrio);
            escribirBarrio.establecerSalida();
            return barrio;
        }
    }

    public static Ciudad encontrarCiudadBuscada() {
        Scanner entrada = new Scanner(System.in);
        String nombreCiudad;
        String nombreProvincia;
        String nombreArchivo = "datos/ciudades.dat";
        ArchivoEscrituraCiudad escribirCiudad = new ArchivoEscrituraCiudad(nombreArchivo);
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
        ArchivoEscrituraConstructora escribirConstructora = new ArchivoEscrituraConstructora(nombreArchivo);
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
