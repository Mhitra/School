import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter a string: ");
            String str = input.nextLine();
            String newStr = "";
            for (int i = 0; i < str.length(); i++) {
                newStr += str.charAt(i) + "" + str.charAt(i) + "" + str.charAt(i);
            }
            System.out.println(newStr);
        }
    }

}
