import java.util.Scanner;
public class Task_3 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter your full name: ");
            String name = input.nextLine();
            String[] names = name.split(" ");
            String initials = "";
            for (int i = 0; i < names.length; i++) {
                initials += names[i].charAt(0) + ".";
            }
            System.out.println(initials);
        }}}




