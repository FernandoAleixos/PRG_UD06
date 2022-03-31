package Actividades;

import java.io.*;
import java.util.Scanner;

public class _10_EscribirFichero2 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        try (FileWriter escribir = new FileWriter(new File("src/Actividades/Actividaes.ficheros/texto.txt"));) {
            System.out.println("Introduce tu nombre: ");
            String nombre = tec.nextLine();
            escribir.write(nombre);
        } catch (IOException e) {
            System.out.println("Problema al escribir en el archivo.");
        }

        try (FileReader leer = new FileReader("src/texto.txt")) {
            int caracter;
            while ((caracter = leer.read()) != -1) {
                char letra = (char) caracter;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
