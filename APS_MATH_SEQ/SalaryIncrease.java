import java.util.Scanner;

public class SalaryIncrease {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Por favor, digite o salário (sem cifrões ou similar): ");
        double salario = reader.nextDouble();
        double increase = salario/ 4;
        double salarioFinal = salario + increase;
        System.out.print("Com o aumento o salário ficou: " + salarioFinal +"0 reais");

        reader.close();
    }
}
