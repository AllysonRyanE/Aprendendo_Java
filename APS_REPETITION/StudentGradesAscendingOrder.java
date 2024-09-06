public class StudentGradesAscendingOrder {
    public static double[] getGradesInAscendingOrder(double[] grades) {
        int n = grades.length;
        boolean swapped;
        // Algoritmo Bubble Sort
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (grades[i] > grades[i + 1]) {
                    double temp = grades[i];
                    grades[i] = grades[i + 1];
                    grades[i + 1] = temp;
                    swapped = true;
                }
            } n--;
        } while (swapped);
        return grades; 
    }
    public static void main(String[] args) {
        //Testes
        System.out.println(java.util.Arrays.toString(getGradesInAscendingOrder(new double[] {10})));
        System.out.println(java.util.Arrays.toString(getGradesInAscendingOrder(new double[] {10, 0}))); 
        System.out.println(java.util.Arrays.toString(getGradesInAscendingOrder(new double[] {10, 9, 8, 2}))); 
        System.out.println(java.util.Arrays.toString(getGradesInAscendingOrder(new double[] {5, 9, 1, 2, 3}))); 
        System.out.println(java.util.Arrays.toString(getGradesInAscendingOrder(new double[] {10, 9, 10, 1, 2, 1}))); 
    }
}
