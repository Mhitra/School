import java.util.Scanner;
public class lab_2 {

 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Task 1\n");

    // todo task 1
   double cost , qty ;
   System.out.print("Enter the quantity:");
        qty = input.nextDouble();
   cost = 15000;
    System.out.println("Total: $ "+qty + cost);
    // todo task 2
    System.out.print("Task 2 \n");
    double firstnum;
    double secondnum;
    double product;
System.out.print("Enter first number to multiply: ");
firstnum = input.nextDouble(); 
System.out.print("Enter second number to multiply: ");
secondnum = input.nextDouble();
product = firstnum * secondnum;
System.out.println(firstnum+ "*" + secondnum+ "=" + product);
// todo task 3
System.out.print("Task 3 \n");
double number1 , number2, number3;
System.out.print("Number 17 :  ");
number1 = input.nextDouble();
System.out.print("Number 27 : ");
number2 = input.nextDouble();
System.out.print("Number 37 : ");
number3 = input.nextDouble();
double avarege = (number1 + number2 + number3) / 3;
System.out.println(number1+","+number2+","+number3);

System.out.println("The avarege is: " + avarege);

// todo task 4
System.out.print("Task 4\n");

System.out.print("Enter the number of fahrenheit: ");
double fahrenheit = input.nextDouble();
double celsius = (5/9 * fahrenheit) - 32;
System.out.println( fahrenheit + " \u00B0F =" + celsius + " \u00B0C" );

}
}

