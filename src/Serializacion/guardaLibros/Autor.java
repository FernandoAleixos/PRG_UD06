package Serializacion.guardaLibros;

import java.io.Serializable;

// Crea la clase autor, con los atributos nombre, año de nacimiento y
// nacionalidad. Incorpora un constructor que reciba todos los datos y el método
// toString() .
public class Autor implements Serializable {

    private String nombre;
    private int anyoNacimiento;
    private String nacionalidad;

    public Autor(String nombre, int anyoNacimiento, String nacionalidad) {
        this.nombre = nombre;
        this.anyoNacimiento = anyoNacimiento;
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Autor: nombre = '" + nombre + '\'' +
                ", anyoNacimiento = " + anyoNacimiento +
                ", nacionalidad = '" + nacionalidad + '\'';
    }
}
