package co.edu.uniquindio.biblioteca.model;

public class Libro {

    private String nombre;
    private int codigo;
    private String genero;
    private String idioma;


    public Libro(String nombre, int codigo, String genero, String idioma) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.genero = genero;
        this.idioma = idioma;
    }


    public Libro() {
    }


    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getGenero() {
        return genero;
    }

    public String getIdioma() {
        return idioma;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }


    @Override
    public String toString() {
        return "Libro{" +
                "nombre='" + nombre + '\'' +
                ", codigo=" + codigo +
                ", genero='" + genero + '\'' +
                ", idioma='" + idioma + '\'' +
                '}';
    }
}
