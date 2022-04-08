public class Dinaret {

    public static void main(String[] args) {
        String[] llistaBars = {"", "Font de Rosa", "Ca Ladio", "Marlio"};
        int aleatori = (int) ((Math.random() * 3) + 1);
        int numPersones = (int) ((Math.random() * 9) + 1);

        System.out.print("El bar que dinarem demá és: " + llistaBars[aleatori]);
        System.out.print("\nNúmero de persones: " + numPersones);
    }
}
