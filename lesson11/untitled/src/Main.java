import java.util.List;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1-Task1");
        System.out.println("2-Task2");
        System.out.println("3-Task3");

        int choice = scanner.nextInt();
        
        if(choice==1) {
                
            Task1 task1 = new Task1();
            System.out.println("Enter the number of items");

            int n = scanner.nextInt();
            System.out.println("Enter the items");
            for(int i=0;i<n;i++) {
                int item = scanner.nextInt();
                task1.push(item);
            }
            System.out.println(" Size: "+task1.size());
            System.out.println("Peek: "+task1.peek());
            System.out.println("Min: "+ task1.min());
            System.out.println("Max:" +task1.max());
            System.out.println("Enter the number of items to pop");
            System.out.println("All items: " + task1.toString());

            System.out.println("Enter the number of items to pop");

            int find = scanner.nextInt();
            if (task1.find(find)) {
                System.out.println("Found");
            }
            else {
                System.out.println("Not found");
            }

            System .out.println("if you want to delete all data press 1 if you don't want something else");
            int m = scanner.nextInt();
            if(m==1) {
                task1.pop();
            }
            else {
                System.out.println("you didn't want to delete");
            }
            System.out.println("Size: "+task1.size());
            System.out.println("All items: " + task1.toString());

        }
        else if(choice==2) {
            Task2 task2 = new Task2();
            System.out.println("Enter the number of items");
            int n = scanner.nextInt();
            System.out.println("Enter the items");
            for(int i=0;i<n;i++) {
                int item = scanner.nextInt();
                task2.add(item);
            }
            System.out.println("Size: "+task2.size());
            System.out.println("Peek: "+task2.peek());
            System.out.println("Min: "+ task2.min());
            System.out.println("Max:" +task2.max());
            //list all item
            
            System.out.println("All items:  ") ; task2.print();
            System.out.println(" ");
        

            System.out.println("Enter the number of items to remove");
            int m = scanner.nextInt();
            for(int i=0;i<m;i++) {
                task2.remove();
            }
            // Find an item in the stack
            System.out.println("Enter the item to find");
            int item = scanner.nextInt();
            System.out.println("Item found at index: " + task2.find(item));


            System.out.println("Size: "+task2.size());















        }else if(choice==3) {
         EmployeeHashtable employeeTable = new EmployeeHashtable();
            employeeTable.addEmployee(1, "John", "Doe");
            employeeTable.addEmployee(2, "Jane", "Smith");
            employeeTable.addEmployee(3, "Mary", "Johnson");
            employeeTable.addEmployee(4, "Bob", "Williams");
            employeeTable.addEmployee(5, "Mike", "Brown");


            System.out.println("Student office \n 1 for add employee  \n 2 for get employee \n 3 for remove employee \n 4 for update employee \n 5 for print all employees \n 0 for exit");
int choice2 = scanner.nextInt();
while(true){
if (choice2==1) {
    System.out.println(" Enter the number of employees");
    int id = scanner.nextInt();
    while(employeeTable.getEmployee(id)!=null) {
        System.out.println("This id is already used");
        id = scanner.nextInt();
    }
    System.out.println("Enter the name");
    String name = scanner.next();
       System.out.println("Enter the surname");
    String surname = scanner.next();
                    

            employeeTable.addEmployee(id, name, surname);

    System.out.println("Student office \n 1 for add employee  \n 2 for get employee \n 3 for remove employee \n 4 for update employee \n 5 for print all employees \n 0 for exit");
    choice2 = scanner.nextInt();           
}
else if(choice2==2) {
    System.out.println("Enter the id of the employee");
    int id = scanner.nextInt();

    Employee employee = employeeTable.getEmployee(id);
    while(employee == null)
 {
                System.out.println("Employee not found");
                id = scanner.nextInt();
            }
                System.out.println("ID: " + employee.getId());


            System.out.println("Name: " + employee.getName());
            System.out.println("Surname: " + employee.getSurname());
            System.out.println("Student office \n 1 for add employee  \n 2 for get employee \n 3 for remove employee \n 4 for update employee \n 5 for print all employees \n 0 for exit");
            choice2 = scanner.nextInt();
            
        }    
        else if(choice2==3) {
            System.out.println("Enter the id of the employee");
            int id = scanner.nextInt();
            employeeTable.removeEmployee(id);
            // Print all employees
            List<Employee> employeeList = employeeTable.getAllEmployees();
            for (Employee employee : employeeList) {
                System.out.println(employee.getName() + " " + employee.getSurname());
            }
            System.out.println("Student office \n 1 for add employee  \n 2 for get employee \n 3 for remove employee \n 4 for update employee \n 5 for print all employees \n 0 for exit");
            choice2 = scanner.nextInt();

        }
        else if(choice2==4) {
            // Change employee's surname
            List<Employee> employeeList = employeeTable.getAllEmployees();
            for (Employee employee : employeeList) {
                System.out.println(employee.getId()+" " +employee.getName() + " " + employee.getSurname());
            }
            System.out.println("Enter the id of the employee");
            int id = scanner.nextInt();

            Employee employee = employeeTable.getEmployee(id);
            System.out.println("Enter the new surname");
            String surname = scanner.next();

            employeeTable.changeSurname(id, surname);
            employee = employeeTable.getEmployee(id);
                System.out.println("ID: " + employee.getId());
                System.out.println("Name: " + employee.getName());
            System.out.println("Surname: " + employee.getSurname());
            System.out.println("Student office \n 1 for add employee  \n 2 for get employee \n 3 for remove employee \n 4 for update employee \n 5 for print all employees \n 0 for exit");
            choice2 = scanner.nextInt();
        }       
        else if(choice2==5) {

                System.out.println("All employees");
                int i =0;
                if (i==0){
                    List<Employee> employeeList = employeeTable.getAllEmployees();
                    for (Employee employee : employeeList) {
                        System.out.println(employee.getName() + " " + employee.getSurname());
                }
                }
            

                
                System.out.println("Student office \n 1 for add employee  \n 2 for get employee \n 3 for remove employee \n 4 for update employee \n 5 for print all employees \n 0 for exit");
                choice2 = scanner.nextInt();
   
            
        }
        else if(choice2==0) {
            System.out.println("Exit");
            break;
        }
}
        }
    
    }
}
    
            
            





    