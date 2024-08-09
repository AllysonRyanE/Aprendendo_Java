import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int n1 = reader.nextInt();
        if (n1%2 == 0){
            System.out.println("O número é par!");
        }
        else{
            System.out.println("O número é impar!");
        }
        reader.close();
    }
}
