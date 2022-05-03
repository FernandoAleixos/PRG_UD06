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
        System.out.print("\n-Mostrar el valor de la posición 5\n" +
                misNumeros.get(misNumeros.indexOf(5)));

        //Añadir el valor 8 en la posición 4
        System.out.print("\n-Añadir el valor 8 en la posición 4\n");
        misNumeros.add(4, 8);
        System.out.println(misNumeros.toString());

        //Cambiar el valor de la posición 1 por 9
        System.out.print("\n-Cambiar el valor de la posición 1 por 9\n");
        misNumeros.set(1, 9);

        //Eliminar el valor 5. (misNumeros.remove(new Integer(5))
        System.out.print("\n-Eliminar el valor 5. (misNumeros.remove(new Integer(5))\n");
        misNumeros.remove(misNumeros.indexOf(5));

        //Eliminar el valor de la posición 3
        System.out.print("\n-Eliminar el valor de la posición 3\n");
        misNumeros.remove(3);

        //Recorrer el array con un bucle for
        System.out.print("\n-Recorrer el array con un bucle for\n");
        for (Integer j : misNumeros) {
            int numPos = 0;
            numPos++;
            System.out.print(numPos + " ");
        }

        //Recorrer el array con un bucle Iterator
        System.out.print("\n-Recorrer el array con un bucle Iterator\n");
        Iterator<Integer> it = misNumeros.iterator();
        for (Iterator<Integer> iter = it; iter.hasNext(); ) {
            iter.next();
            System.out.println("iterator");
        }

        //Comprobar si existe el elemento 0
        System.out.print("\n-Comprobar si existe el elemento 0\n");
        if (misNumeros.contains(0)) {
            System.out.println(0);
        }

        //Comprobar si existe el elemento 7
        System.out.print("\n-Comprobar si existe el elemento 7\n");
        if (misNumeros.contains(7)) {
            System.out.println(7);
        }

        //Clonar el ArrayListmisNumeros en otro llamado copiaArrayList
        ArrayList <Integer> copiaArrayList = new ArrayList<>();
        copiaArrayList = (ArrayList<Integer>) misNumeros.clone();

        //Añadir el elemento 9
        misNumeros.add(9);

        //Mostrar la posición de la primera ocurrencia del elemento 9
        misNumeros.indexOf(9);

        //Mostrar la posición de la última ocurrencia del elemento 9
        System.out.print("\n-Mostrar la posición de la última ocurrencia del elemento 9\n" +
                misNumeros.lastIndexOf(9));

        //Borrar todos los elementos del ArrayListcopiaArrayList
        System.out.print("\n-Borrar todos los elementos del ArrayListcopiaArrayList\n");
        copiaArrayList.clear();

        //Comprobar si el ArrayListcopiaArrayList está vacio
        System.out.print("\n-Comprobar si el ArrayListcopiaArrayList está vacio\n");
        if (copiaArrayList.isEmpty()) {
            System.out.println("Vacío");
        } else {
            System.out.println("El array contiene elementos.");
        }

        //Convertir el ArrayListmisNumeros en un Array y recorrerlo con un bucle mejorado
        Integer[] array = new Integer[misNumeros.size()];
        int i = 0;

        for (Integer f : array) {
            array[i] = misNumeros.get(i);
            System.out.print(array[i] + ", ");
            i++;
        }
    }
}
