import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
        public static void main(String[] args) {
        Employee employee1 = new Employee("John Smith", "AA11111", 50000, 2015);
        Employee employee2 = new Employee("Jane Doe", "BB22222", 60000, 2010);
        Employee employee3 = new Employee("Bob Johnson", "CC33333", 55000, 2017);
        Employee employee4 = new Employee("Mary Smith", "DD44444", 65000, 2008);

        Person person1 = new Person("Ola Sifer", "EE55555");
        Person person2 = new Person("Janet Day", "FF66666");
        Person person3 = new Person("Danky Xans", "GG77777");
        Person person4 = new Person("Dan Georic", "HH88888" );


        List<Person> people = Arrays.asList(employee1, employee2, employee3 , employee4 , person1, person2, person3 , person4);

        List<Employee> employees = Arrays.asList(employee1, employee2, employee3 , employee4);

        x employee = new x();
        System.out.println("1) to display all people in alphabetical order");
        
        employee.displayAllPeople(people);
        System.out.println(" ");

        System.out.println(" 2) to display only employees in alphabetical order");
        employee.displayEmployees(employees);
        System.out.println(" ");

        System.out.println("3) to find name of a employee based on national insurance number");

int i = 1;
        for (Employee employee5 : employees) {
            System.out.println( i +")"  + " " +employee5.getNationalInsuranceNumber());
            i++;
        }
      Scanner scanner = new Scanner(System.in);
            System.out.print("Enter national insurance number: ");
            String nationalInsuranceNumber = scanner.nextLine();
            employee.findEmployeeByNationalInsuranceNumber(employees, nationalInsuranceNumber);
        System.out.println(" ");
        System.out.println("4) to increase salary of employees who have been working for more than 5 years by 10%");
        System.out.println(" ");
System.out.println(" Before increase salary");
System.out.println(" ");
   i = 1; 
        for (Employee employee5 : employees) {
            System.out.println( i+")" + " "  + employee5.getName() + " " + employee5.getAnnualSalary());
            i++;
        }
        System.out.println(" ");
        System.out.println("Enter current year: ");
        String year = scanner.nextLine();
        employee.increaseSalaryForLongTermEmployees(employees, Integer.parseInt(year));
        System.out.println("After increase salary");
        System.out.println(" ");
        i = 1;
        for (Employee employee5 : employees) {

            System.out.println( i+")" + " " +employee5.getName()+" " +employee5.getAnnualSalary());
            i++;
        }
    }
}