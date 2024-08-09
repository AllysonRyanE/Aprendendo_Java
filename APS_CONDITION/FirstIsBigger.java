import java.util.Scanner;
public class FirstIsBigger {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double n1 = reader.nextDouble();
        System.out.println("Digite o segundo número: ");
        double n2 = reader.nextDouble();
        System.out.println("Digite o terceiro número: ");
        double n3 = reader.nextDouble();

        if(n1>n2 && n1>n3){
            System.out.println("Condição satisfeita");
        }
        else {
            System.out.println("ERRO");
        }
        reader.close();
    }
}
