package co.edu.uniquindio.biblioteca;

import co.edu.uniquindio.biblioteca.model.Biblioteca;
import co.edu.uniquindio.biblioteca.model.Cliente;
import co.edu.uniquindio.biblioteca.model.Empleado;
import co.edu.uniquindio.biblioteca.model.Libro;

import java.util.Scanner;


public class Main{
    public static void main(String[] args) {

        Biblioteca biblioteca = inicializarDatos();
        int opcionSelecionada = 0;

        int opcionSeleecionada;
        do {
            mostrarMenu();
            opcionSelecionada    = leerEntero("Ingrese la opción del menú");
            switch (opcionSelecionada) {
                case 1:
                    String resultado = crearCliente(biblioteca);
                    System.out.println("Información del cliente: "+resultado);
                    break;
                case 2:
                    Cliente cliente = obtenerCliente(biblioteca);
                    int edad = leerEntero("Ingrese la edad del cliente a validar");
                    String resultadoValidacion = validarEdadCliente(cliente, edad);
                    System.out.println("Resultado de la operación: "+resultadoValidacion);
                    break;
                case 3:
                    String resultadoLibro = crearLibro(biblioteca);
                    System.out.println("Información del libro: " + resultadoLibro);
                    break;


                case 4:
                    String nombreLibro = leerStringConsola("Ingrese el nombre del libro a validar");
                    Libro libro = obtenerLibro(biblioteca); // Método que busca el libro
                    String resultadoNombre = validarNombreLibro(libro, nombreLibro);
                    System.out.println("Resultado de la operación: " + resultadoNombre);
                    break;

                case 5:
                    String resultadoEmpleado = crearEmpleado(biblioteca);
                    System.out.println("Información del empleado: " + resultadoEmpleado);
                    break;
                default:
                    break;


            }
        } while (opcionSelecionada != 6);
    }



    private static String validarEdadCliente(Cliente cliente, int edad) {
        if(cliente != null){
            if(cliente.getEdad() == edad) {
                return "La edad del cliente es valida";
            }else{
                return "La edad del cliente no es valida";
            }
        }else{
            return "No se puede validar, el cliente no existe";
        }
    }

    private static String validarNombreLibro(Libro libro, String nombre) {
        if (libro != null) {
            if (libro.getNombre().equalsIgnoreCase(nombre)) {
                return "El nombre del libro es válido";
            } else {
                return "El nombre del libro no coincide";
            }
        } else {
            return "No se puede validar, el libro no existe";
        }
    }

    private static Cliente obtenerCliente(Biblioteca biblioteca) {
        String idCliente = leerStringConsola("Ingrese el id del cliente a buscar");
        Cliente clienteEncontrado = null;
        for (int i = 0; i < biblioteca.getListaClientes().size(); i++) {
            if (biblioteca.getListaClientes().get(i).getId().equals(idCliente)) {
                clienteEncontrado = biblioteca.getListaClientes().get(i);
                break;
            }
        }
        return clienteEncontrado;
    }

    private static Libro obtenerLibro(Biblioteca biblioteca) {
        int codigoLibro = leerEntero("Ingrese el código del libro a buscar");
        Libro libroEncontrado = null;
        for (Libro libro : biblioteca.getListaLibros()) {
            if (libro.getCodigo() == codigoLibro) {
                libroEncontrado = libro;
                break;
            }
        }
        return libroEncontrado;
    }

    public static String crearCliente(Biblioteca biblioteca) {
        //1.Capturar los datos del cliente
        String nombre = leerStringConsola("Ingrese el nombre del cliente");
        String id = leerStringConsola("Ingrese el Id de cliente");
        String telefono = leerStringConsola("Ingrese el telefono de cliente");
        int edad = leerEntero("Ingrese edad del cliente");
        //2. Crear la instancia del cliente
        Cliente cliente = new Cliente();
        //3. Agregar los datos capturados al cliente
        cliente.setNombre(nombre);
        cliente.setId(id);
        cliente.setTelefono(telefono);
        cliente.setEdad(edad);
        biblioteca.getListaClientes().add(cliente);
        //4. retornar respuesta
        return cliente.toString();
    }

    public static String crearEmpleado(Biblioteca biblioteca) {
        String nombreEmpleado = leerStringConsola("Ingrese el nombre del empleado");
        String apellidoEmpleado = leerStringConsola("Ingrese el apellido del empleado");
        int cedulaEmpleado = leerEntero("Ingrese la cédula del empleado");
        int edadEmpleado = leerEntero("Ingrese la edad del empleado");

        Empleado empleado = new Empleado(nombreEmpleado, apellidoEmpleado, cedulaEmpleado, edadEmpleado);
        empleado.setNombre(nombreEmpleado);
        empleado.setApellido(apellidoEmpleado);
        empleado.setCedula(cedulaEmpleado);
        empleado.setEdad(edadEmpleado);

        biblioteca.getListaEmpleados().add(empleado); // Asegúrate de tener este método en tu clase Biblioteca

        return empleado.toString();
    }


    public static String crearLibro(Biblioteca biblioteca) {
        // 1. Capturar los datos del libro
        String nombreLibro = leerStringConsola("Ingrese el nombre del libro:");
        int codigoLibro = leerEntero("Ingrese el código del libro:");
        String generoLibro = leerStringConsola("Ingrese el género del libro:");
        String idiomaLibro = leerStringConsola("Ingrese el idioma del libro:");

        // 2. Crear la instancia del libro
        Libro libro = new Libro(nombreLibro, codigoLibro, generoLibro, idiomaLibro);

        // 3. Agregar el libro a la biblioteca
        biblioteca.getListaLibros().add(libro);

        // 4. Retornar la información del libro
        return libro.toString();
    }


    private static Biblioteca inicializarDatos() {
        //Crear la biblioteca
        Biblioteca biblioteca = new Biblioteca("UQ");
        //Crear el cliente
        Cliente cliente = new Cliente();
        cliente.setNombre("Juan");
        cliente.setId("1094");
        cliente.setTelefono("87676768");
        cliente.setEdad(30);
        biblioteca.getListaClientes().add(cliente);

        return biblioteca;
    }

    public static String leerStringConsola(String mensaje){
        String captura="";
        System.out.println(mensaje);
        Scanner teclado = new Scanner(System.in);
        captura = teclado.nextLine();
        return captura;
    }


    public static int leerEntero(String mensaje){
        int respuesta = 0;
        System.out.println(mensaje);
        Scanner leer = new Scanner(System.in);
        respuesta = leer.nextInt();
        return respuesta;
    }

    public static void mostrarMenu() {
        System.out.println("Opciones disponibles:");
        System.out.println("1 - Crear Cliente");
        System.out.println("2 - Validar edad del cliente");
        System.out.println("3 - Crear libro");
        System.out.println("4 - Validar nombre del libro");
        System.out.println("5 - Crear empleado");
        System.out.println("6 - Salir");
    }



}
