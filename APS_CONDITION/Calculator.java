import java.util.Scanner;
public class Calculator {
    public static void main(String [] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite 1 para soma\nDigite 2 para subtração\nDigite 3 para multiplicação\nDigite 4 para divisão");
        int operator = reader.nextInt();
        System.out.println("Digite o primeiro número: ");
        int n1 = reader.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = reader.nextInt();
        int result = 0;
        if (operator == 1){
            result = n1 + n2;
            System.out.println("Soma: "+result);
        }
        else if(operator == 2){
            result = n1 - n2;
            System.out.println("Subtração: "+result);

        }
        else if(operator == 3){
            result = n1 * n2;
            System.out.println("Multiplicação: "+result);

        }
        else{
            if (n2==0){
                System.out.println("Tentativa de divisão por 0");
            }
            result = n1/n2;
            System.out.println("Divisão "+result);
        }
        reader.close();
    }
}
