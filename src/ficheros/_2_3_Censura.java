package ficheros;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class _2_3_Censura {
    // He optado por hacer el método static porque sino tendriamos
    // que crear un constructor lo cual no pide el ejercicio.
    public static void aplicaCensura(String entrada, String censura, String salida) {
        HashMap <String, String> mapa = new HashMap<>();
        String[] palabras, palabras2;
        String linea;

        // Cojemos el fichero de censura para poder guardarlo en el HasMap
        try (BufferedReader bcensura = new BufferedReader(new FileReader(censura))) {
            //Leemos el fichero linea por linea y lo guardamos en el mapa
            while ((linea = bcensura.readLine()) != null) {
                palabras2 = linea.split(" ");

                for (String p : palabras2) {
                    String clave = palabras2[0];
                    String valor = palabras2[1];
                    mapa.put(clave, valor);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Ahora leemos el fichero de entrada para poder ir cambiando la censura y guardando la en un fichero de salida
        try (BufferedReader lectura = new BufferedReader(new FileReader(entrada));
             BufferedWriter escritura = new BufferedWriter(new FileWriter(salida))) {
            while ((linea = lectura.readLine()) != null) {
                palabras = linea.split(" ");
                for (String p: palabras) {
                    if (mapa.containsKey(p)) {
                        escritura.write(mapa.get(p) + " ");
                    } else {
                        escritura.write(p + " ");
                    }
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Introduce el fichero de entrada: ");
        String entrada = tec.nextLine();

        System.out.println("Ahora introduce el fichero de censura:");
        String censura = tec.nextLine();

        System.out.println("Introduce el fichero donde quieres que se guarde:");
        String salida = tec.nextLine();

        aplicaCensura(entrada, censura, salida);
    }
}
