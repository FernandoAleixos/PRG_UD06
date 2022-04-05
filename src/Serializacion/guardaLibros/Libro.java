package Serializacion.guardaLibros;

import java.io.Serializable;

// Crea la clase Libro, con los atributos titulo, año de edición y autor
// (Objeto de la clase autor). Incorpora un constructor que reciba todos los datos
// y el método toString() .
public class Libro implements Serializable{

    private String titulo;
    private int anyoEdicion;
    private Autor autor;

    public Libro(String titulo, int antoEdicion, Autor autor) {
        this.titulo = titulo;
        this.anyoEdicion = antoEdicion;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro: \ntitulo = " + titulo +
                "\n anyoEdicion = " + anyoEdicion +
                "\n autor = " + autor;
    }
}
