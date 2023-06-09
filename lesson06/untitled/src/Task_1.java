import java.util.Scanner;
public class Task_1
{
    public static void main(String[] args)
    {
     try (
        Scanner input = new Scanner(System.in)) {
            System.out.println("Enter a string: ");
            String str = input.nextLine();
            System.out.println("Enter a character: ");
            char ch = input.next().charAt(0);
            while (  (!Character.isLetter(ch))) {
                    for (int i = 0; i < str.length(); i++) {
                        if (str.charAt(i) == ch) {
                        }
                    }
                    System.out.println("The character is not a letter\nPlease enter a letter:");
                    ch = input.next().charAt(0);
                
            }

            int index = str.indexOf(ch);
            System.out.println("The first occurrence of " + ch + " is at index " + index);
        }
           
    }
}