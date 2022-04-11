package carpetas;

import java.io.File;
import java.util.Scanner;

// Implementa un programa que haga lo siguiente:
// Cambiar el nombre de la carpeta carpetas.Documentos a DOCS, el de la carpeta Fotografias a FOTOS y el de la carpeta Libros a LECTURAS
// Cambiar el nombre de todos los archivos de las carpetas FOTOS y LECTURAS quitándole la extensión.
// Por ejemplo, astronauta.jpg pasará a llamarse astronauta
public class _23_Lionel {

    public static  void quitarExtension(File ruta) {
        File[] listaFicheros = ruta.listFiles() ;

        for (File f : listaFicheros) {
            String[] nombres = f.getName().split(".");
            f.renameTo(new File(f.getParent() + "/" + nombres[0]));
        }
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        //Cremos dos variables tipo File para cambiar el nombre de Documentos por DOCS.
        File docIni = new File("src/carpetas/Documentos");
        File docRename = new File("src/carpetas/DOCS");
        //Renombreamos la carpeta Documentos.
        docIni.renameTo(docRename);

        //Cambiamos la ruta Fotografias por FOTOS
        File docIni2 = new File("src/carpetas/DOCS/Fotografias");
        File docRename2 = new File("src/carpetas/DOCS/FOTOS");
        //Renombramos la carpeta Fotografias por FOTOS
        docIni2.renameTo(docRename2);

        //Cambiamos la ruta Libros por LECTURAS
        File docIni3 = new File("src/carpetas/DOCS/Libros");
        File docRename3 = new File("src/carpetas/DOCS/LECTURAS");
        //Renombreamos la carpeta Libros por LECTURAS
        docIni3.renameTo(docRename3);

        quitarExtension(docRename2);
        quitarExtension(docRename3);

    }
}
