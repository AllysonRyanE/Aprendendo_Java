import java.util.Scanner;
public class dividir100{
    public static void dividir100 (double [] n){
        for (int i = 0; i< n.length; i++){
            n[i] = n[i]/100;
        }
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double n [] = new double[5];
        int i = 0;
        double answer;
        for (; i<5; i++){
            do{

                System.out.println("Por favor, digite um número entre 1 e 100 (incluindo-os) para posição " + (i+1) + ": ");
                answer = reader.nextDouble();
                if (1 > answer || 100 < answer){
                    System.out.println("Digite um número válido");
                }
                else {
                    n[i] = answer;
                }
            } while(1 > answer || 100 < answer);
        }
        dividir100(n);
        System.out.println("Conteúdo dividido por 100:");
        for (int j = 0; j< n.length; j++){
            System.out.println(n[j]);
        }
        reader.close();
    }
}
