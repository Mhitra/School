import java.util.Scanner;
public class Task_5 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int rows = 2;
int columns = 4;
int[][] arr = new int[rows][columns];
for (int i = 0; i < rows; i++) {
for (int j = 0; j < columns; j++) {
System.out.println("Enter the element at position " + i + " " + j);
arr[i][j] = input.nextInt();
}}
System.out.println("The array is: ");
for (int i = 0; i < rows; i++) {
for (int j = 0; j < columns; j++) {
System.out.print(arr[i][j] + " ");
}
System.out.println();
}
System.out.println("The array after transformation is: ");
for (int i = 0; i < columns; i++) {
for (int j = 0; j < rows; j++) {
System.out.print(arr[j][i] + " ");
}
System.out.println();
}}}