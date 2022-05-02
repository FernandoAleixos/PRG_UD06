package colecciones;

import java.util.ArrayList;
import java.util.Iterator;

public class Actividad1 {

    public static void main(String[] args) {
        //Crear un ArrayList de enteros llamado misNumeros
        ArrayList<Integer> misNumeros = new ArrayList<Integer>();

        //Añadir los valores 1, 6, 3, 2, 0, 4, 5
        misNumeros.add(1);
        misNumeros.add(6);
        misNumeros.add(3);
        misNumeros.add(2);
        misNumeros.add(0);
        misNumeros.add(4);
        misNumeros.add(5);

        //Mostrar los datos del ArrayList
        misNumeros.toString();


        //Mostrar el valor de la posición 5
        System.out.println("\n-Mostrar el valor de la posición 5\n" +
                misNumeros.get(misNumeros.indexOf(5)));

        //Añadir el valor 8 en la posición 4
        System.out.println("\n-Añadir el valor 8 en la posición 4\n");
        misNumeros.add(4, 8);
        System.out.println(misNumeros.toString());

        //Cambiar el valor de la posición 1 por 9
        System.out.println("\n-Cambiar el valor de la posición 1 por 9\n");
        misNumeros.set(1, 9);

        //Eliminar el valor 5. (misNumeros.remove(new Integer(5))
        System.out.println("\n-Eliminar el valor 5. (misNumeros.remove(new Integer(5))\n");
        misNumeros.remove(misNumeros.indexOf(5));

        //Eliminar el valor de la posición 3
        System.out.println("\n-Eliminar el valor de la posición 3\n");
        misNumeros.remove(3);

        //Recorrer el array con un bucle for
        System.out.println("\n-Recorrer el array con un bucle for\n");
        for (Integer j : misNumeros) {
            int numPos = 0;
            numPos++;
            System.out.print(numPos + " ");
        }

        //Recorrer el array con un bucle Iterator
        System.out.println("\n-Recorrer el array con un bucle Iterator\n");
        Iterator<Integer> it = misNumeros.iterator();
        for (Iterator<Integer> iter = it; iter.hasNext(); ) {
            System.out.println("iterator");
        }

        //Comprobar si existe el elemento 0
        System.out.println("\n-Comprobar si existe el elemento 0\n" +
                misNumeros.contains(0));

    }
}
