package ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
* Escribe  un  programa  que,  sin  utilizar la  clase Scanner,
* muestre el número de lineas que contiene un fichero de texto.
* El nombre del fichero se solicitará al usuario al comienzo de la ejecución*/
public class _2_1_CuentaLineas {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String fichero = "";
        String linea;
        int cont = 0;

        System.out.println("Introduce la ruta del fichero: ");
        fichero = tec.nextLine();

        try (BufferedReader lectura = new BufferedReader(new FileReader(fichero))){
            while ((linea = lectura.readLine()) != null) {
                cont++;
            }
            System.out.println("El fichero tiene "+ cont + " líneas.");
        } catch (IOException e) {
            System.out.println("Problema al leer o escribir");
        }
    }
}
