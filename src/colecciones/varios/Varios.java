package colecciones.varios;

import java.util.Arrays;

public class Varios {

    public static int[] quitarDuplicados(int v[]) {
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length; j++) {
                if (v[i] == v[j]) {
                    v[j] = 0;
                }
            }
        }
        Arrays.sort(v);
        return v;
    }

    public static int[] union1(int[] v1, int[] v2) {
        int[] arrayFinal = new int[v1.length + v2.length];

        quitarDuplicados(v1);
        quitarDuplicados(v2);


        return ;
    }
}
