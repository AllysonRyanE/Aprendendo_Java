import java.util.Scanner;
public class FuncBiggerOrEqual{
    public static String bigger(double n1, double n2){
        String result = "";
       if (n1>n2){
            result = "O "+ n1 + " é o maior número";
        }
        else if (n2>n1){
            result = "O "+ n2 + " é o maior número";
        }
        else{
            result = "Os números são iguais";
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double n1, n2;
        do{
            System.out.println("Por favor, digite o primeiro número: ");
            n1 = reader.nextDouble();
            if (n1 <= 0){
                System.out.println("Número inválido, digite um número maior que 0.");
            }
        } while (n1 <= 0);
        do{
            System.out.println("Por favor, digite o segundo número: ");
            n2 = reader.nextDouble();
            if (n2<=0){
                System.out.println("Número inválido, digite um número maior que 0.");
            }
        } while (n2 <= 0);
        String result = bigger(n1, n2);
        System.out.println(result);
        reader.close();
    }
}
