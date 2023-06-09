import java.util.Scanner;
public class Task_5 {
    public static void main(String[] args) {
            try (Scanner in = new Scanner(System.in)) {
                System.out.println("Enter an Price: ");
                
                int a = in.nextInt();
                
                if(1000<=a && a < 2000){
                   double discount = a*95/100 ;
                System.out.println("You have %5 discount the fee you will pay "+discount);
                }
                if(2000 <=a && a < 5000){
                    double discount = a*90/100; 
                 System.out.println("You have %10 discount the fee you will pay "+discount);
                 }
                 if(5000 <=a){
                    double discount = a*85/100 ;
                 System.out.println("You have %15 discount the fee you will pay "+discount);
                 }
                 else{
                     System.out.println("You dont have discount");
                    }
            }
            
           
    }
}
