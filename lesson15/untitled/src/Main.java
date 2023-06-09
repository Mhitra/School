import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the number of the task: ");
            System.out.print("1. Schedule\n2. Employee \n3. Triangle \n");
            int choice = scanner.nextInt();
            if(choice == 1){
            Monday monday = new Monday();
            Tuesday tuesday = new Tuesday();
            Wednesday wednesday = new Wednesday();

            System.out.println("Enter the number of lessons for Monday: ");
            int numLessons = scanner.nextInt();
            while (1 == numLessons || 4 < numLessons) {
                System.out.println("The number of lessons must be less than 5 or more than one lesson\nEnter the number of lessons for Monday: ");
                numLessons = scanner.nextInt();
            }
            scanner.nextLine();
            for (int i = 0; i < numLessons; i++) {
                System.out.println("Enter the title of lesson " + (i + 1) + ": ");
                monday.addLesson(scanner.nextLine());
            }
            System.out.println("Enter the number of lessons for Tuesday: ");
            numLessons = scanner.nextInt();
            while (1 == numLessons ||4 < numLessons) {
                System.out.println("The number of lessons must be less than 5 or more than one lesson\nEnter the number of lessons for Tuesday: ");      
                          numLessons = scanner.nextInt();
            }
            scanner.nextLine();
            for (int i = 0; i < numLessons; i++) {
                System.out.println("Enter the title of lesson " + (i + 1) + ": ");
                tuesday.addLesson(scanner.nextLine());
            }
            
            System.out.println("Enter the number of lessons for Wednesday: ");
            numLessons = scanner.nextInt();
            while (1 == numLessons || 4 < numLessons) {
                System.out.println("The number of lessons must be less than 5 or more than one lesson\nEnter the number of lessons for Wednesday: ");
                numLessons = scanner.nextInt();
            }
            scanner.nextLine();
            for (int i = 0; i < numLessons; i++) {
                System.out.println("Enter the title of lesson " + (i + 1) + ": ");
                wednesday.addLesson(scanner.nextLine());
            }
            System.out.println("\nMonday schedule: ");
            monday.getDay();
            System.out.println("\nTuesday schedule: ");
            tuesday.getDay();
            System.out.println("\nWednesday schedule: ");
            wednesday.getDay();
        }
        if(choice ==2){
            Employee employee = new Employee();
                employee.getStatus();
            Developer developer = new Developer();
            SeniorDeveloper seniorDeveloper = new SeniorDeveloper();
            Tester tester = new Tester();
            System.out.println("Developer status: ");
            developer.getStatus();
            System.out.println("Senior developer status: ");
            seniorDeveloper.getStatus();
            System.out.println("Tester status: ");
            tester.getStatus();
        }
        if(choice==3){
            System.out.println("Enter the segments of the triangle: ");
            System.out.println("Segment 1: ");
            int segment1 = scanner.nextInt();
            System.out.println("Segment 2: ");
            int segment2 = scanner.nextInt();
            System.out.println("Segment 3: ");
            int segment3 = scanner.nextInt();
            System.out.println("Segment 4: ");
            int segment4 = scanner.nextInt();
            MyTriangle triangle = new MyTriangle(segment1, segment2, segment3, segment4 );
            if (triangle.isTriangle()) {
                System.out.println("Area of the triangle: ");
                triangle.area();
                System.out.println("Perimeter of the triangle: " ); triangle.perimeter() ;
            } else {
                System.out.println("The given segments cannot form a triangle.");
            }}}}}
