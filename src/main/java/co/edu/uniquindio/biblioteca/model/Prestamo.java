package co.edu.uniquindio.biblioteca.model;

public class Prestamo {
    private int numeroPrestamo;
    private String fechaPrestamo;
    private String fechaEntrega;
    private String descripcion;

    Prestamo(int numeroPrestamo, String fechaPrestamo, String fechaEntrega, String descripcion) {
        this.numeroPrestamo = numeroPrestamo;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaEntrega = fechaEntrega;
        this.descripcion = descripcion;
    }
    public int getNumeroPrestamo() {
        return this.numeroPrestamo;
    }
    public void setNumeroPrestamo(int numeroPrestamo) {
        this.numeroPrestamo = numeroPrestamo;
    }
    public String getFechaPrestamo() {
        return this.fechaPrestamo;
    }
    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }
    public String getFechaEntrega() {
        return this.fechaEntrega;
    }
    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}

