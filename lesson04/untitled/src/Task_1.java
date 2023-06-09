import java.util.Scanner;
public class Task_1 {
public static void main(String[] args) {
try (Scanner in = new Scanner(System.in)) {
    System.out.print("Enter a number: \n (if you want to exit enter 0) ");
    int a = in.nextInt();
    int sum = 0;
    int product = 1;
    int i = 0;
    while (a != 0) {
    if(a>0){
    sum = sum + a;
    i++;
    } else if(a<0){
    product = product * a;
    i++;
    }
    if (i == 10) {
    break;
    }
    a = in.nextInt();
    }
    if (product == 1) {
    product = 0;
    }
    System.out.println("Sum of the positive numbers is "+sum);
    System.out.println("Product of the negative numbers is "+product);
    System.out.println("Number of entered numbers is "+i);
}


}
}
