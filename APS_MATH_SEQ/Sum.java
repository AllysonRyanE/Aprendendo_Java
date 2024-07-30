import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        double n1 = reader.nextDouble();
        System.out.print("Segundo número: ");
        double n2 = reader.nextDouble();
        System.out.print("Terceiro número: ");
        double n3 = reader.nextDouble();
        System.out.print("Quarto número: ");
        double n4 = reader.nextInt();
        double sum = n1 + n2 + n3 + n4;
        System.out.println("R = " + sum);

        reader.close();
    }
}


