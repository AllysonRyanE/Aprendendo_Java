import java.util.Scanner;
public class parImpar{
    public static String parImpar (int n){
        String result;
        if (n%2 == 0){
            result = n + " é par";
        }
        else{
            result = n + " é impar";
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite um número inteiro para saber se é par: ");
        int n = reader.nextInt();
        String result = parImpar(n);
        System.out.println(result);
        reader.close();
    }
}
