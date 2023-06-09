import java.util.Scanner;
public class Task_4 {
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        System.out.println("Enter a character: ");
        char ch1 = input.next().charAt(0);
        System.out.println("Enter another character: ");
        char ch2 = input.next().charAt(0);
        System.out.println("Enter a new character: ");
        char ch3 = input.next().charAt(0);
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch1) {
                newStr += ch3;
            } else if (str.charAt(i) == ch2) {
                newStr += ch3;
            } else {
                newStr += str.charAt(i);
            } }
        System.out.println(newStr);
    }
}
}