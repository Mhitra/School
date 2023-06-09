import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
public class Task_2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int a = input.nextInt();
            System.out.print("Enter a number: ");
            int b = input.nextInt();
                        File file = new File("src\\Task_2.txt");
            if (file.exists()) {
                System.out.println("File already exists");
                System.exit(0);
            }
                try (PrintWriter output = new PrintWriter(new File("src\\Task_2.txt"))) {
                    if (a < b) {
                   output.println("a < b" +" "+ a +" < "+b);
                   System.out.println("a < b" +" "+ a +" < "+b);
                } else {
                    output.println("a > b " + a +" > "+b);
                    System.out.println("a > b " + a +" > "+b);
                }
    
                    }
                }
                catch (Exception e) {
                    e.getStackTrace();
                }
            
            }
        }