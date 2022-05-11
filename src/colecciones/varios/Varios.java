package colecciones.varios;

import java.security.CodeSource;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Varios {

    public static int[] quitarDuplicados(int v[]) {
        LinkedHashSet<Integer> listado = new LinkedHashSet<>();

        for (int i = 0; i < v.length; i++) {
            listado.add(v[i]);
        }

        int[] sinDuplicados = new int[listado.size()];

        int i = 0;
        for (Integer f : listado) {
            sinDuplicados[i++] = f;
        }

        return sinDuplicados;
    }

    public static int[] union1(int[] v1, int[] v2) {

    }

    public static int[] union2() {

    }

    public static void main(String[] args) {
        int[] v = {1, 2, 3 ,4, 4};
        quitarDuplicados(v);
    }
}
