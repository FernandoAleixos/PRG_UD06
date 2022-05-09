package colecciones;

import java.util.HashMap;

public class Actividad5 {


    public static void main(String[] args) {
        HashMap<String, Double> divisas = new HashMap<>();

        divisas.put("Dólar Americano", 0.81);
        divisas.put("Franco Suizo", 0.85);
        divisas.put("Libra Esterlina", 1.14);
        divisas.put("Corona Danesa", 0.13);
        divisas.put("Peso Mexicano", 0.04);
        divisas.put("Dólar Singapur", 0.62);
        divisas.put("Real Brasil", 0.24);

        //Mostrar el valor de Libra Esterlina
        divisas.get("Libra Esterlina");

        //Mostrar todas las divisas con las que se opera y su valor
        System.out.println(divisas.toString());

        //Indicar el número de divisas del Map
        System.out.println(divisas.size());

        //Eliminar la divisa Real Brasil y mostrar los datos del Map
        divisas.remove("Real Brasil");

        //Mostrar si existe la divisa Peso Mexicano
        System.out.println(divisas.containsKey("Peso Mxicano"));

        //Mostrar si existe la divisa Euro
        System.out.println("Euro " + divisas.containsKey("Euro"));

        //Mostrar si existe el valor al cambio 0.85 €
        System.out.println(divisas.containsValue(0.85));

        //Mostrar si existe el valor al cambio 0.33 €
        System.out.println(divisas.containsValue(0.33));

        //Indicar si el Map divisas está vacío
        System.out.println(divisas.isEmpty());

        //Borra todos los componentes del Map divisas
        divisas.clear();

        //Volver a indicar si el Map divisas está vacío
        System.out.println(divisas.isEmpty());
    }
}
