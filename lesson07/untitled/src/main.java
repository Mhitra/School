import java.util.Scanner;
public class main {
        public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter 1 for Employee, 2 for Math, 3 for Student");
            int choice = input.nextInt();
           while (choice != 1 || choice != 2 || choice != 3) {
            if (choice == 1 || choice == 2 || choice == 3) {
                break;
            } System.out.println("Incorrect entry please select again \nEnter 1 for Employee, 2 for Student, 3 for Math");
                    choice = input.nextInt(); }
            if (choice == 1) {
                Employee employee1 = new Employee("John", "Doe", 987978, 123456789, "12343244 Main St");
                Employee employee2 = new Employee("Anna", "Smith", 321321312, 987654321, "43243242 Main St");
                employee1.printInfo();
                System.out.println();
                employee2.printInfo();       }
            if (choice == 3) {
                Student student1 = new Student("Anna", "Smith", 46456456, "Computer Science", 2019);
                Student student2 = new Student("John", "Doe", 321321, "Computer Science", 2020);
                student1.printInfo();
                student1.yearOfStudy(student1.yearOfEnrollment);
                System.out.println();
                student2.printInfo();
                student2.yearOfStudy(student2.yearOfEnrollment);
            }
            if (choice == 2) {
                System.out.println("Enter three numbers: ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                int num3 = input.nextInt();
                System.out.println("Sum: " + Math.sum(num1, num2, num3));
                System.out.println("Average: " + Math.average(num1, num2, num3));
                System.out.println("Product: " + Math.product(num1, num2, num3));
            }  } }}
