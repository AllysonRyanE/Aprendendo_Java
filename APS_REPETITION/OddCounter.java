import java.util.Scanner;

public class OddCounter {
    public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);
        System.out.println("Digite o primeiro número: ");
        int n1 = reader.nextInt();
        System.out.println("Digite o segundo número (MAIOR QUE O PRIMEIRO): ");
        int n2 = reader.nextInt();
        int i = n1;
        while(i<=n2){
            if (i%2 != 0){
                System.out.println("É impar: "+ i);
            }
            i++;
            }
        reader.close();
    }
}
