import java.util.Scanner;
public class BiggerOrEqual {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Por favor, digite o primeiro número: ");
        double n1 = reader.nextDouble();
        System.out.println("Digite agora o segundo número para que sejam comparados: ");
        double n2 = reader.nextDouble();
        if (n1>n2){
           System.out.println("O "+ n1 + " é o maior número");
        }
        else if (n1<n2){
            System.out.println("O "+ n2 + " é o maior número");
        }
        else{
            System.out.println("Números iguais.");
        }
        }
    }
