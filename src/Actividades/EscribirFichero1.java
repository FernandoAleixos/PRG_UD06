package Actividades;

import java.io.*;
import java.util.Scanner;

//(EscribirFichero1) Escribe un programa que, usando las clases FileOutputStream y FileInputStream.
public class EscribirFichero1 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner tec = new Scanner(System.in);

        //escriba los caracteres de tu nombre en un fichero ( nombre.txt ).
        try (DataOutputStream archivo = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream("./nombre.txt")));) {

        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        }
    }

}
