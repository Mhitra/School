import java.util.Scanner;
public class Task_5 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = input.nextInt();
            
            switch (number) {
                case 1:
                    System.out.println("Monday");
                    System.out.println("Math \nEnglish \nHistory");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    System.out.println("Programming \n English \n History");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    System.out.println("Math \n English \n History");
                    break;
                case 4:
                    System.out.println("Thursday");
                    System.out.println("Math \n English \n History");
                    break;
                case 5:
                    System.out.println("Friday");
                    System.out.println("Math \n English \n History");
                    break;
                case 6:
                    System.out.println("Saturday");
                    System.out.println("No lessons");
                    break;
                case 7:
                    System.out.println("Sunday");
                    System.out.println("No lessons");
                    break;
                default:
                    System.out.println("Invalid number");
            }
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
