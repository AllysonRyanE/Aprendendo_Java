import java.util.Scanner;
public class findNumber{
    public static int findNumber (double [] n, int key){
        int index = -1;
        for (int i = 0; i< 5; i++){
            if (n[i] == key){
                index = i;
                break;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double n [] = new double[5];
        int i = 0;
        double value;
        for (; i<5; i++){
            System.out.println("Insira o dado da posição " + (i+1) + ": ");
            value = reader.nextDouble();
            n[i] = value;
        }
        System.out.println("Insira a chave de busca: ");
        int key = reader.nextInt();
        int result = findNumber(n, key);
        if (result!= -1){
           System.out.println("Chave encontrada na posição "+ (result+1));
        }
        else{
            System.out.println("Chave não encontrada!");
        }
        reader.close();
    }
}
