package carpetas;

import java.io.File;

// Implementa un programa que cree, dentro de Documentos , dos nuevas carpetas: Mis Cosas y Alfabeto.
// Mueve las carpetas Fotografias y Libros dentro de Mis Cosas .
// Luego crea dentro de Alfabeto una carpeta por cada letra del alfabeto (en mayúsculas): A , B , C ... Z .
public class _24_Lionel {

    public static void crearCarpetas(File ruta) {
        System.out.println("Carpeta: " + ruta.mkdir() + " creada.");
    }

    public static void moverCarpetas(File carpeta, String destino) {
        carpeta.getAbsolutePath();
        carpeta.renameTo(new File(destino));
        if (carpeta.renameTo(new File(destino))) {
            System.out.println("Se ha movido la carpeta indicada.");
        } else {
            System.out.println("Ha habido un error.");
        }

    }

    public static void main(String[] args) {
        File misCosas = new File("src/carpetas/DOCS/MisCosas");
        File alfabeto = new File("src/carpetas/DOCS/Alfabeto");

        //crearCarpetas(misCosas);
        //crearCarpetas(alfabeto);
        moverCarpetas(misCosas, "src/MisCosas/");
        moverCarpetas(alfabeto, "src/Alfabeto/");
    }
}
