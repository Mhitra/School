import java.util.Scanner;


public class Lab_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
 
        //task 1
        System.out.println("Task 1");
      System.out.println("Enter an integer: ");
      int a = in.nextInt();
        System.out.println("Enter a double: ");
        double b = in.nextDouble();
        System.out.println("Enter a string: ");
        String c = in.next();
        System.out.println("Enter a boolean: ");
        Boolean d = in.nextBoolean();
        System.out.print("Enter text: ");

        String t = in.next();
        
        System.out.println("Enter a text: ");
        System.out.println("My Number: " + a);
        System.out.println("My Double Number: " + b);
        System.out.println("My Letter: " + c);
        System.out.println("My Boolean: " + d);
        System.out.println("My Text: " + t);
        //task 2
        System.out.println("Task 2 - x+5");
        System.out.println("Enter an x: ");
        int x = in.nextInt();
        int y = 5;
        System.out.println("x + y = " + (x + y));
        //task 3
        System.out.println("Task 3 - Even or Odd");
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        //task 4
        System.out.println("Task 4 - Positive or Negatife or Zero");
        System.out.println(" Enter a number: ");
        int num1 = in.nextInt();
        if (num1 > 0) {
            System.out.println("Positive");
        } else if (num1 < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
       
        //task 5
        int i;
        System.out.println("Task 5 - Print 7 to 98");
        for (i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }
        //task 6
        System.out.println("Task 6 - multiplication table ");
        int num2;
        System.out.println(" Enter a number: ");
        num2 = in.nextInt();
        for (i = 1; i <= 10; i++) {
            System.out.println(num2 + " x " + i + " = " + (num2 * i));
        }
        //task 7
        System.out.println("Task 7 - Sum of the even and odd integers");
        int num3;
        int sumEven = 0;
        int sumOdd = 0;
        int k ;
        System.out.println(" Enter a number: ");
        num3 = in.nextInt();
        for (k = 1; k <= num3; k++) {
            if (k % 2 == 0) {
                sumEven += k;
            } else {
                sumOdd += k;
            }
        }
        System.out.println("Sum of the even integers: " + sumEven);
        System.out.println("Sum of the odd integers: " + sumOdd);

        //task 8

       int marks[] = new int[6];
       int j;
       float total=0, avg;
       
         System.out.println("Task 8 ");
       
       for(j=0; j<3; j++) { 
          System.out.print(" Enter Marks of Subject"+(j+1)+":");
          marks[j] = in.nextInt();
          total = total + marks[j];
       }
       in.close();
       avg = total/3;
       System.out.print("The student Grade is: ");
       System.out.println(avg);
       if(avg>=90)
       {
           System.out.print("A");
       }
       else if(avg>=75 && avg<90)
       {
          System.out.print("B");
       } 
       else if(avg>=65 && avg<75)
       {
           System.out.print("C");
       }
       else
       {
           System.out.print("D");
       }
      
    }

}
