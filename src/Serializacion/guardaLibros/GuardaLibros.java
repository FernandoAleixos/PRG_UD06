package Serializacion.guardaLibros;

// Escribe un programa (GuardaLibros) que cree tres libros y los almacene en el
// fichero biblioteca.obj .

import java.io.*;

public class GuardaLibros implements Serializable{

    public static void main(String[] args) {

        Libro libro1 = new Libro("Harry Potter", 1997, new Autor("J.K.Rowling",1965,"Inglesa"));
        Libro libro2 = new Libro("Quijote de la Mancha", 1605, new Autor("Cervantes", 1550, "Española"));
        Libro libro3 = new Libro("CataDAW", 2022, new Autor("David", 1976, "Carlet"));

        try (ObjectOutputStream salida = new ObjectOutputStream(
                new FileOutputStream("src/Serializacion/biblioteca.obj"));){

            salida.writeObject(libro1);
            salida.writeObject(libro2);
            salida.writeObject(libro3);
            salida.close();

            System.out.println("Se han añadido los libros correctamente.");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
