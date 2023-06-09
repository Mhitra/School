import java.util.Scanner;
public class Task_4 {
public static void main(String[] args) {
    try (Scanner in = new Scanner(System.in)) {
        int a = in.nextInt();
            int fac = 1;
            for(int i = 1 ; i<=a ; i++){
             fac = fac * i;
            }
                System.out.println("!"+a+" = "+fac);
    }

}
}