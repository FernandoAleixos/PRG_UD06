package Actividades;

import java.io.*;
import java.util.Scanner;

//(EscribirFichero1) Escribe un programa que, usando las clases FileOutputStream y FileInputStream.
public class _9_EscribirFichero1 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner tec = new Scanner(System.in);

        //escriba los caracteres de tu nombre en un fichero ( nombre.txt ).
        try (DataOutputStream archivo = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream("src/Actividades/Actividaes.ficheros/nombre.txt")));) {

            System.out.println("Introduce tu nombre: ");
            String nombre = tec.nextLine();
            archivo.writeUTF(nombre);

        } catch (FileNotFoundException e) {
            System.out.println("Problema al abrir el fichero.");
        } catch (IOException e) {
            System.out.println("Problema al leer o escribir.");
        }
    }
}
