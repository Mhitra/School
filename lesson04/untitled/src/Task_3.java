import java.util.Scanner;
public class Task_3 {
public static void main(String[] args) {
    try (Scanner in = new Scanner(System.in)) {
        System.out.println("Enter a Number: ");
        int number = in.nextInt();
        while (number<0) {
            System.out.println("Negative. Please enter a positive number:");
            number = in.nextInt();
        }
              if(0<number){
                for (int i=1; i<=number; i++)
                {
                    if(number%i==0)
                        System.out.println(i);
                }
              }
    }

}
}
