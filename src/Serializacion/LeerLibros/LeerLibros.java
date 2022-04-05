package Serializacion.LeerLibros;

import Serializacion.guardaLibros.Libro;

import java.io.*;

public class LeerLibros{

    public static void main(String[] args) {
        try (ObjectInputStream leer = new ObjectInputStream(
                new FileInputStream("src/Serializacion/biblioteca.obj"));) {

                Libro l1 = (Libro) leer.readObject();
                System.out.println(l1);
                Libro l2 = (Libro) leer.readObject();
                System.out.println(l2);
                Libro l3 = (Libro) leer.readObject();
                System.out.println(l3);
                leer.close();

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
