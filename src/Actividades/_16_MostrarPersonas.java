package Actividades;

import java.io.*;

public class _16_MostrarPersonas {

    public static void main(String[] args) {
        try (DataOutputStream lectura = new DataOutputStream(
                new BufferedOutputStream(
                        new FileReader("src/Actividades/Actividaes.ficheros/personas.dat")));) {

            
        } catch (EOFException e) {

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
