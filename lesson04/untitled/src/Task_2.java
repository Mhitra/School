import java.util.Scanner;
public class Task_2 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter a character: ");
            char a = in.next().toLowerCase().charAt(0);
            switch (a) {
                case 'a':
                    System.out.println("Vowel");
                    break;
                case 'e':
                    System.out.println("Vowel");
                    break;
                case 'i':
                    System.out.println("Vowel");
                    break;
                case 'o':
                    System.out.println("Vowel");
                    break;
                case 'u':
                    System.out.println("Vowel");
                    break;
                case 'y':
                    System.out.println("Consonant");
                    break;
                case 'b':
                    System.out.println("Consonant");
                    break;
                case 'c':
                    System.out.println("Consonant");
                    break;
                case 'd':
                    System.out.println("Consonant");
                    break;
                case 'f':
                    System.out.println("Consonant");
                    break;
                case 'g':
                    System.out.println("Consonant");
                    break;
                case 'h':
                    System.out.println("Consonant");
                    break;
                case 'j':
                    System.out.println("Consonant");
                    break;
                case 'k':
                    System.out.println("Consonant");
                    break;
                case 'l':
                    System.out.println("Consonant");
                    break;
                case 'm':
                    System.out.println("Consonant");
                    break;
                case 'n':
                    System.out.println("Consonant");
                    break;
                case 'p':
                    System.out.println("Consonant");
                    break;
                case 'q':

                    System.out.println("Consonant");
                    break;
                case 'r':
                    System.out.println("Consonant");
                    break;
                case 's':
                    System.out.println("Consonant");
                    break;
                case 't':
                    System.out.println("Consonant");
                    break;
                case 'v':
                    System.out.println("Consonant");
                    break;
                case 'w':
                    System.out.println("Consonant");
                    break;
                case 'x':
                    System.out.println("Consonant");
                    break;
                case 'z':
                    System.out.println("Consonant");
                    break;

                default:
                    System.out.println("Not a letter");
                    break;
            }
        }




    }
}
