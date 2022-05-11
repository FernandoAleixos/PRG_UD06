package colecciones.varios;

import java.security.CodeSource;
import java.util.ArrayList;
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

    public static int[] union2(int[] v1, int[] v2) {

    }

    public static int[] diferencia1(int[] v1, int[] v2) {
        ArrayList<Integer> conjunto1 = new ArrayList<>();
        ArrayList<Integer> conjunto2 = new ArrayList<>();

        for (int i = 0; i < v1.length; i++) {
            conjunto1.add(v1[i]);
        }

        for (int i = 0; i < v2.length; i++) {
            conjunto2.add(v2[i]);
        }

        conjunto1.removeAll(conjunto2);

        int[] diferencia = new int[conjunto1.size()];

        int i = 0;
        for (Integer f : diferencia) {
            diferencia[i++] = f;
        }

    }

    public static int[] diferencia2(int[] v1, int[] v2) {

    }

    public static void main(String[] args) {
        int[] v = {1, 2, 3 ,4, 4};
        quitarDuplicados(v);
    }
}
