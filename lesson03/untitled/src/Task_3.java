import java.util.Scanner;
public class Task_3 {
public static void main(String[] args) {
try (Scanner input = new Scanner(System.in)) {
    System.out.print("Enter a number: ");
    int number = input.nextInt();
    if (number % 10 == 0) {
    System.out.println("Number can be divided by 10 evenly");
    } else {
    System.out.println("Number can not be divided by 10 evenly");
    }
}
}
}
