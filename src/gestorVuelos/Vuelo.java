package gestorVuelos;

import java.time.LocalTime;

public class Vuelo {

    private static final int MAX_PASAJEROS = 50;

    private String identificador;
    private String origen;
    private String destino;
    private LocalTime hSalida;
    private LocalTime hLlegada;
    private String[] asiento;
    private int numP;

    //Constructor que crea un vuelo con identificador, ciudad de
    //origen, ciudad de destino, hora de salida y hora de llegada indicados en los
    //respectivos parámetros, y sin pasajeros.
    public Vuelo(String id, String orig, String dest, LocalTime hsal, LocalTime hlleg) {
        this.identificador = id;
        this.origen = orig;
        this.destino = dest;
        this.hSalida = hsal;
        this.hLlegada = hlleg;
        this.asiento = new String[MAX_PASAJEROS + 1];
        this.numP = 0;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public boolean hayLibres() {
        return (this.numP < MAX_PASAJEROS);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vuelo vuelo = (Vuelo) o;

        return identificador != null ? identificador.equals(vuelo.identificador) : vuelo.identificador == null;
    }

    public int reservarAsiento(String pas, char pref) throws VueloCompletoException{
        if (hayLibres()) {

        } else {
            throw new VueloCompletoException();
        }
        return ;
    }

    private class VueloCompletoException extends Exception {
    }
}
