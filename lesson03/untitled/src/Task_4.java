import java.util.Scanner;
public class Task_4 {
//Write Java program that reads a set of integers, and then prints the sum of the even and odd integers.
public static void main(String[] args) {
try (Scanner input = new Scanner(System.in)) {
    int sumEven = 0;
    int sumOdd = 0;
    int number;
    System.out.println("Enter a number: ");
    number = input.nextInt();
for (int i = 0; i < number ; i++) {
    

    System.out.println("Enter a number: ");
    number = input.nextInt();
    if (number % 2 == 0) {
        sumEven += number;
    } else {
        sumOdd += number;
    }
}
    System.out.println("Sum of even numbers: " + sumEven);
    System.out.println("Sum of odd numbers: " + sumOdd);
}
}




}