package carpetas;

import java.io.File;
import java.util.Scanner;

public class _21_Lionel {

    //Si es un archivo, mostrará por pantalla el nombre del archivo.
    //Si es un directorio, mostrará por pantalla la lista de directorios y archivos que
    //contiene (sus nombres). Deberá mostrar primero los directorios y luego los
    //archivos.
    //En cualquier caso, añade delante del nombre la etiqueta [*] o [A] para indicar si
    //es un directorio o un archivo respectivamente.
    //Si el path no existe lanzará un FileNotFoundException .
    public static void muestraInfoRuta(File ruta) {
        if (ruta.isDirectory()) {
            File[] contenido = ruta.listFiles();
            StringBuilder sbd = new StringBuilder();
            StringBuilder sbf = new StringBuilder();

            for (File archivo : contenido) {
                if (archivo.isDirectory()) {
                    sbd.append(archivo.getName()).append("\n");
                } else {
                    sbf.append(archivo.getName()).append("\n");
                }
            }
            System.out.println("*" + sbd.toString());
            System.out.println("A" + sbf.toString());
        } else {
            System.out.println("La ruta " + ruta.getAbsolutePath() + " no es una carpeta.");
        }
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        File fichero;

        System.out.print("Introduce una ruta de ficheros: ");
        String directorio = tec.nextLine();
        fichero = new File(directorio);

    }
}
