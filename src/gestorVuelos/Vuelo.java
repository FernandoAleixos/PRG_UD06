package gestorVuelos;

import java.time.LocalTime;
import java.util.Arrays;

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

    //Si el vuelo ya está completo se lanza una excepción. Si
    //no está completo, se reserva al pasajero pas el primer asiento libre en pref . El
    //carácter pref será ' P ' o ' V ' en función de que el pasajero desee un asiento de
    //pasillo o de ventanilla. En caso de que no quede ningún asiento libre en la
    //preferencia indicada ( pref ), se reservará el primer asiento libre de la otra
    //preferencia. El método devolverá el número de asiento que se le ha reservado.
    public int reservarAsiento(String pas, char pref) throws VueloCompletoException{
        if (hayLibres()) {
            if (asientoLibre(pref) != 0) {
                asiento[asientoLibre(pref)] = pas;
                return asientoLibre(pref);
            } else {

                return asientoLibre(pref);
            }
        } else {
            throw new VueloCompletoException();
        }
    }

    private int asientoLibre(char pref) {
        if (hayLibres()) {
            int contadorInicial = 0;
            if (pref == 'V') {
                contadorInicial = 1;
            } else if (pref == 'P') {
                contadorInicial = 2;
            }

            for (int i = contadorInicial; i < asiento.length; i += 2) {
                if (asiento[i] == null) {
                    numP--;
                    return i;
                }
            }
            return 0;
        } else {
            return 0;
        }
    }
    private class VueloCompletoException extends Exception {
    }

    public void cancelarReserva(int numasiento) {
        if (numasiento > 0 && numasiento < asiento.length) {
            if (asiento[numasiento] != null) {
                asiento[numasiento] = null;
                numP--;
                for (int i = numP; i < asiento.length - 1; i++) {
                    asiento[i] = asiento[i + 1];
                }
            } else {
                System.out.println("No hay ninguna reserva en este sitio.");
            }
        } else {
            System.out.println("El asiento introducido no es valido.");
        }

    }


}
