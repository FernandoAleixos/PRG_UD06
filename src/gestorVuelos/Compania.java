package gestorVuelos;

import java.io.*;

public class Compania {

    private final int MAX_VUELOS = 10;
    private String nombre;
    private Vuelo[] listaVuelos;
    private int numVuelos;

    public Compania(String n) throws FileNotFoundException{
        this.nombre = n;
        this.listaVuelos = new Vuelo[MAX_VUELOS];
        this.numVuelos = 0;
        leeVuelos();
    }

    // Lee desde un fichero
    // toda la información de los vuelos que ofrece la compañía y los va almacenando
    // en el array de vuelos listaVuelos . El nombre del fichero coincide con el
    // nombre de la compañía y tiene extensión .txt . La información de cada vuelo
    // se estructura en el fichero como sigue:
    //----------------------
    // <Identificador>
    // <Origen>
    // <Destino>
    // <Hora de salida>
    // <Minuto de salida>
    // <Hora de llegada>
    // <Minuto de llegada>
    // ...
    // ---------------------
    private void leeVuelos() throws FileNotFoundException {
        try (BufferedReader salida = new BufferedReader(
                new FileReader("src/gestorVuelos/" + this.nombre + ".txt"))) {


            while (salida.readLine()) {

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}