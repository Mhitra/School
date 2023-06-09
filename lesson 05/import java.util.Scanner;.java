import java.util.Scanner;

public class Main {

        public static void main (String[] args ) {

            //Write Java program to find the largest and the smallest element in the array. The program has to give the user the indices of these elements
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the number of elements in the array: ");
            int n = input.nextInt();
            int[] array = new int[n];
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                array[i] = input.nextInt();
                if (array[i] == 10) {
                   break;
                }
            }
            int max = array[0];
            int min = array[0];
            int maxIndex = 0;
            int minIndex = 0;
            for (int i = 0; i < n; i++) {
                if (array[i] > max) {
                    max = array[i];
                    maxIndex = i;
                }
                if (array[i] < min) {
                    min = array[i];
                    minIndex = i;
                }
            }
            System.out.println("The largest element is " + max + " and its index is " + maxIndex);
            System.out.println("The smallest element is " + min + " and its index is " + minIndex);

        }
}