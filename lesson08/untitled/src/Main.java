import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            //TASK 1
            System.out.println("Enter the name of the dish: \n1-Breakfast, \n2-Lunch, \n3-Dinner");
            //menü listesi
            String name = input.nextLine().toLowerCase();
            Menu menu = new Menu(name);
            menu.printMenu();
        System.out.println();

            //TASK2
        Country country = new Country("Poland");
        System.out.println(country.getCountry());
        System.out.println();
        //task 4
        System.out.println("Enter the name of the subject: 1-Computer Science, 2-Medicine, 3-Law");
        String lessons = input.nextLine().toLowerCase();
        Subjects subjects = new Subjects(lessons);
        subjects.printSubjects();
        System.out.println();
        //task 3
            System.out.println("Enter of conversion: \n1-Centimeters to Inches, \n2-Inches to Centimeters, \n3-Meters to Yards, \n4-Yards to Meters, \n5-Celsius to Fahrenheit, \n6-Fahrenheit to Celsius");
                int convert = input.nextInt();
                if (convert == 1) {
                    System.out.println("Enter the number of centimeters: ");
                    double centimeters = input.nextDouble();
                    System.out.println(centimeters + " centimeters = " + Converter.centimetersToInches(centimeters) + " inches");
                } else if(convert==2){
                    System.out.println("Enter the number of inches: ");
                    double inches = input.nextDouble();
                    System.out.println(inches + " inches = " + Converter.inchesToCentimeters(inches) + " centimeters");
                } else if(convert==3){
                    System.out.println("Enter the number of meters: ");
                    double meters = input.nextDouble();
                    System.out.println(meters + " meters = " + Converter.metersToYards(meters) + " yards");
                } else if(convert==4){
                    System.out.println("Enter the number of yards: ");
                    double yards = input.nextDouble();
                    System.out.println(yards + " yards = " + Converter.yardsToMeters(yards) + " meters");
                } else if(convert==5){
                    System.out.println("Enter the number of Celsius: ");
                    double celsius = input.nextDouble();
                    System.out.println(celsius + " Celsius = " + Converter.celsiusToFahrenheit(celsius) + " Fahrenheit");
                } else if(convert==6){
                    System.out.println("Enter the number of Fahrenheit: ");
                    double fahrenheit = input.nextDouble();
                    System.out.println(fahrenheit + " Fahrenheit = " + Converter.fahrenheitToCelsius(fahrenheit) + " Celsius");
                } else {
                    System.out.println("Incorrect entry");
                }
    }
      
        }
    