package streams;

import java.io.*;
import java.util.Scanner;

public class _14_Personas {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        try (DataOutputStream fichero = new DataOutputStream(
                new BufferedOutputStream(
                    new FileOutputStream("src/Actividades/Actividaes.ficheros/personas.dat")));) {

            System.out.println("Introduce tu nombre: ");
            String nombre = tec.nextLine();

            System.out.println("Introduce tu edad: ");
            int edad = tec.nextInt();

            System.out.println("Introduce tu peso: ");
            double peso = tec.nextDouble();

            System.out.println("Introduce tu estatura: ");
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
