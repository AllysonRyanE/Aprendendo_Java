package Aprendendo_Java.APS_MATH_SEQ;

import java.util.Scanner;

public class Mean {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("DIGITE TRÊS NOTAS DE ATIVIDADES: ");
        double n1 = reader.nextDouble();
        double n2 = reader.nextDouble();
        double n3 = reader.nextDouble();
        double mean = (n1 + n2 + n3) / 3;
        System.out.println("NOTA FINAL: " + mean);

        reader.close();
    }
}
