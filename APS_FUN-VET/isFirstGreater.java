import java.util.Scanner;
public class isFirstGreater{
    public static String isFirstGreater (double [] n){
        String result = "";
        if (n[0] > n[1] && n[0] > n[2]){
            result = "Condição satisfeita";
        }
        else{
            result = "ERRO";
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double n[] = new double[3];
        int i = 0;
        for (; i < 3;) {
            System.out.println("Por favor, digite um número: ");
            n[i] = reader.nextDouble();
            i++;
        }
        String result = isFirstGreater(n);
        System.out.println(result);
        reader.close();
    }
}
