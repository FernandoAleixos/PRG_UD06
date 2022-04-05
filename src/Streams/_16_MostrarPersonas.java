package Streams;

import java.io.*;

public class _16_MostrarPersonas {

    public static void main(String[] args) {
        try (DataInputStream lectura = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream("src/Actividades/ficheros/personas.dat")));) {

            while(true) {
                System.out.println(lectura.readUTF());
                System.out.println(lectura.readInt());
                System.out.println(lectura.readDouble());
                System.out.println(lectura.readDouble());
            }
        } catch (EOFException e) {
            System.out.println("Ha finalizado el fichero.");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
