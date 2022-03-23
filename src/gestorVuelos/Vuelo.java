package gestorVuelos;

import java.time.LocalTime;

public class Vuelo {

    private String identificador;
    private String origen;
    private String destino;
    private LocalTime hSalida;
    private LocalTime hLlegada;
    private String[] asiento;
    private int numP;

    public Vuelo(String id, String orig, String dest, LocalTime hsal, LocalTime hlleg) {
        this.identificador = id;
        this.origen = orig;
        this.destino = dest;
        this.hSalida = hsal;
        this.hLlegada = hlleg;

    }
}
