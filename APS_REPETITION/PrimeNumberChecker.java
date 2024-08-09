import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);
        System.out.println("Digite um número: ");
        int n = reader.nextInt();
        boolean primo= true;
        if(n==2){
            primo = true;
        }
        else if(n<= 1 || n%2==0){
            primo = false;
        }
        else{
            for(int i = 3; i * i <= n; i+=2){
                if(n%i==0){
                    primo= false;
                    break;
                }
            }
        }
        if (primo){
            System.out.println(n + " é primo!");
        }
        else{
            System.out.println(n +" não é primo!");
        }
        reader.close();
    }
}
