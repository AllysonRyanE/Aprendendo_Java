public class Rainfall {
   public static double averageRainfall(double[] rainfall) {
      double sum = 0;
      int i = 0;
      int count = 0;
      while (i < rainfall.length) {
         if (rainfall[i] != 9999 && rainfall[i] >= 0) {
            sum += rainfall[i];
            count++;
         } else if (rainfall[i] == 9999) {
            break;
         }
         i++;
      }
      if (count == 0) {
         return 0.0;
      } else {
         return sum / count;
      }
   }

   public static void main(String[] args) {
      double[] test1 = {1, 2, 3, 4, 5, 9999};
      System.out.println("Resultado: " + averageRainfall(test1) + " | Esperado: 3.0");
      double[] test2 = {1, 2, -3, 4, 5, 9999};
      System.out.println("Resultado: " + averageRainfall(test2) + " | Esperado: 3.0");
      double[] test3 = {1, 2, 3, 4, 5, 9999, 6, 7};
      System.out.println("Resultado: " + averageRainfall(test3) + " | Esperado: 3.0");
      double[] test4 = {1, 2, 3, -4, 9999, 5};
      System.out.println("Resultado: " + averageRainfall(test4) + " | Esperado: 2.0");
      double[] test5 = {10, 9999};
      System.out.println("Resultado: " + averageRainfall(test5) + " | Esperado: 10.0");
      double[] test6 = {10, 0, 9999};
      System.out.println("Resultado: " + averageRainfall(test6) + " | Esperado: 5.0");
      double[] test7 = {-1, -2, -3, 9999};
      System.out.println("Resultado: " + averageRainfall(test7) + " | Esperado: 0.0");
      double[] test8 = {9999};
      System.out.println("Resultado: " + averageRainfall(test8) + " | Esperado: 0.0");
   }
}
