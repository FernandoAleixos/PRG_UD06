package streams;

import java.io.*;
import java.util.Scanner;

public class _15_AñadirPersonas {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        boolean respuesta = false;

        System.out.print("¿Quieres sobre escribir el archivo? (si, no)");
        String eleccion =  tec.nextLine();
        eleccion.toLowerCase();

        do {
            if (eleccion == "si") {
                respuesta = true;
            } else if (eleccion == "no") {
                respuesta = false;
            } else {
                System.out.println("ERROR, no se a podido reconocer la elección.");
            }
        } while (eleccion != "si" || eleccion != "no");


        try (DataOutputStream fichero = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream("src/Actividades/Actividaes.ficheros/personas.dat", respuesta)));) {

            System.out.print("Introduce tu nombre: ");
            String nombre = tec.nextLine();

            System.out.print("Introduce tu edad: ");
            int edad = tec.nextInt();

            System.out.print("Introduce tu peso: ");
            double peso = tec.nextDouble();

            System.out.print("Introduce tu estatura: ");
            double estatura = tec.nextDouble();

            fichero.writeUTF(nombre);
            fichero.writeInt(edad);
            fichero.writeDouble(peso);
            fichero.writeDouble(estatura);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
