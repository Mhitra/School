import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter three numbers: ");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int num3 = input.nextInt();
            System.out.println("Sum: " + sum(num1, num2, num3));
            System.out.println("Average: " + average(num1, num2, num3));
            System.out.println("Product: " + product(num1, num2, num3));
        }
    }
    public static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    public static int average(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3;
    }
    public static int product(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }
}
