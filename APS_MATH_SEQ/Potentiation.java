import java.util.Scanner;

public class Potentiation {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Base:");
        double base = reader.nextDouble();
        System.out.print("Expoente: ");
        double expoente = reader.nextDouble();

        double resultado = Math.pow(base, expoente);
        System.out.print("R = " + resultado);

        reader.close();
    }
}
