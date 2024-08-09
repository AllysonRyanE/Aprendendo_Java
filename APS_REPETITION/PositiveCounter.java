import java.util.Scanner;

public class PositiveCounter {
    public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);
        final String CONDICION = "'0' é a condição de parada.";
        System.out.println(CONDICION);
        int count = 0;
        while(true){
            System.out.println("Digite um número: ");
            double n = reader.nextDouble();
            if (n==0){
                System.out.printf("\nForam inseridos %d números inteiros positivos.", count);
                break;
            }
            else{
                if (n == (int) n && n>0){
                    count += 1;
                }
            }
        }
        reader.close();
    }
}
