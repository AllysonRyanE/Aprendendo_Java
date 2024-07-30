import java.util.Scanner;

public class Mean {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Primeira atividade: ");
        double n1 = reader.nextDouble();
        System.out.print("Segunda atividade: ");
        double n2 = reader.nextDouble();
        System.out.print("Terceira atividade: ");
        double n3 = reader.nextDouble();
        double mean = (n1 + n2 + n3) / 3;
        System.out.println("NOTA FINAL: " + mean);

        reader.close();
    }
}
