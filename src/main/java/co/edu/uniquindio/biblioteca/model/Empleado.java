package co.edu.uniquindio.biblioteca.model;

public class Empleado {
    public String nombre;
    private String apellido;
    private int cedula;
    private int edad;

    public Empleado(String nombre, String apellido, int cedula, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;

    }

    public String getNombre() {
        return this.nombre;
    }
    public static void setNombre(String nombre) {
        nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    public static void setApellido(String apellido) {
     apellido = apellido;
    }
    public int getCedula() {
        return this.cedula;
    }
    public static void setCedula(int cedula) {
        cedula = cedula;
    }
    public int getEdad() {
        return this.edad;
    }
    public static void setEdad(int edad) {
     edad = edad;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "nombre='" + nombre + '\'' +
                ", apellido=" + apellido +
                ", cedula='" + cedula + '\'' +
                ", edad='" + edad + '\'' +
                '}';
    }
}
