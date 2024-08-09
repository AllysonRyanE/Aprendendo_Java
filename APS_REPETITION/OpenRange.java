import java.util.Scanner;
public class OpenRange {
    public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);
        System.out.println("Digite o primeiro número: ");
        int n1 = reader.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = reader.nextInt();
        int i = n1+1;
        while(i<n2){
            if (i< n2-1){
                System.out.print(i++ +", ");
            }
            else{
                System.out.print(i++);
            }
        }
    reader.close();
    }
}
