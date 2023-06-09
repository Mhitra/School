import java.util.Scanner;
public class Task_1 {
public static void main(String[] args) {
try (Scanner input = new Scanner(System.in)) {
    System.out.print("Enter a number: ");
    int number = input.nextInt();
    if (number >= 10 && number <= 99 ||number >= -99 && number <= -10) {
    System.out.println("Number has two digits");
    } else {
    System.out.println("Number has not two digits");
    }
}
}
}
