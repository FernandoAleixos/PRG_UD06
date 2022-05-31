package ficheros;

import java.io.*;

public class _2_4_Concatenar1 {

    public static void concatenar(String f1, String f2) {
        try (BufferedReader lectura = new BufferedReader(new FileReader(f1));
        BufferedWriter escritura = new BufferedWriter(new FileWriter("/home/ferale/Escriptori/Carpeta nova/f3.txt"))) {

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

    }
}
