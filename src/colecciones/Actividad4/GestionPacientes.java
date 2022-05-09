package colecciones.Actividad4;

import java.beans.FeatureDescriptor;
import java.util.ArrayList;
import java.util.Scanner;

public class GestionPacientes {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        ArrayList<Paciente> archivador = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            System.out.print("Introduce el nombre del paciente: ");
            String nombre = tec.nextLine();

            System.out.print("Introduce los apellidos del paciente: ");
            String apellidos = tec.nextLine();

            System.out.println("Introduce la edad del paciente: ");
            int edad = tec.nextInt();
            tec.nextLine();

            Paciente fichaPaciente = new Paciente(nombre, apellidos, edad);

            archivador.add(fichaPaciente);
        }
        System.out.println(archivador.toString());
        archivador.remove(2);
        System.out.println(archivador.toString());
    }
}
