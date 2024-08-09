import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("DIGITE QUATRO NÚMEROS PARA QUE SEJAM SOMADOS:");
        double n1 = reader.nextDouble();
        double n2 = reader.nextDouble();
        double n3 = reader.nextDouble();
        double n4 = reader.nextInt();
        double sum = n1 + n2 + n3 + n4;
        System.out.println("R = " + sum);

        reader.close();
    }
}


