import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Por favor, digite a base do triângulo: ");
        double b = reader.nextDouble();
        System.out.print("Por favor, digite a altura do triângulo: ");
        double h = reader.nextDouble();

        double area = (b * h) / 2;
        System.out.print("ÁREA = " + area);

        reader.close();
    }
}
