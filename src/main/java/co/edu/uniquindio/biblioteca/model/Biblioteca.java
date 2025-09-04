package co.edu.uniquindio.biblioteca.model;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private String nombre;
    private ArrayList<Cliente> listaClientes;
    private List<Libro> listaLibros;

    // Constructor
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.listaClientes = new ArrayList<>();
        this.listaLibros = new ArrayList<>();
    }

    // Getter del nombre
    public String getNombre() {
        return nombre;
    }
    private List<Empleado> listaEmpleados = new ArrayList<>(

    );

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }


    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }


    public void agregarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }


    public Cliente buscarClientePorId(String idCliente) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getId().equals(idCliente)) {
                return cliente;
            }
        }
        return null;
    }


    public List<Libro> getListaLibros() {
        return listaLibros;
    }


    public void agregarLibro(Libro libro) {
        listaLibros.add(libro);
    }

    public Libro buscarLibroPorCodigo(int codigo) {
        for (Libro libro : listaLibros) {
            if (libro.getCodigo() == codigo) {
                return libro;
            }
        }
        return null;
    }

}