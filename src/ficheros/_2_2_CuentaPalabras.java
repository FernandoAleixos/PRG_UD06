package ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _2_2_CuentaPalabras {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String fichero = "";
        String linea;
        StringTokenizer contPalabras;
        int cont = 0;

        System.out.println("Introduce la ruta del fichero: ");
        fichero = tec.nextLine();

        try (BufferedReader lectura = new BufferedReader(new FileReader(fichero))) {
            while ((linea = lectura.readLine()) != null) {
                contPalabras = new StringTokenizer(linea);
                cont += contPalabras.countTokens();
            }
            System.out.println(cont);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
