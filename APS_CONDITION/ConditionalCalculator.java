import java.util.Scanner;
public class ConditionalCalculator{
  public static void main(String args[]) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Digite o primeiro número: ");
    double n1 = reader.nextDouble();
    System.out.println("Digite o segundo número: ");
    double n2 = reader.nextDouble();
    double result = 0;
    if (n1==n2){
        result = n1 * n2;
        System.out.println("O produto entre os números é "+result);
    }
    else if(n1>n2){
        result = n1 - n2;
        System.out.println("O resto entre os números é "+result);

    }
    else{
        result = n1+n2;
        System.out.println("A soma entre os números é "+result);
    }
  reader.close();
  }
}
