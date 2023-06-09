import java.util.Scanner;
import java.util.ArrayList;
public class Task2 {

    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Mhitra", "Skyfall", "Ms", 5));
        users.add(new User("James", "Bond", "Jb", 7));
        users.add(new User("John", "Doe", "Jd", 3));
        users.add(new User("Janne", "Xods", "Jx", 4));
while(true){
               System.out.println("         Welcome to the library");    
            System.out.println("     What action do you want to take ?");
            System.out.println("--------------------------------------------");
            System.out.println("|1. Add a new user                         |");
            System.out.println("|2. Find the user who read the most books  |");
            System.out.println("|3. Find the user who read the least books |");
            System.out.println("|4. Information about all users            |");
            System.out.println("|5. Exit the program                       |");
            System.out.println("--------------------------------------------");
            Scanner scanner = new Scanner(System.in);
            int action = scanner.nextInt();
        while (action < 1 || action > 5) {
                System.out.println("Enter a number from 1 to 4");
                action = scanner.nextInt();
            }
            if(action == 1){
                System.out.println("Enter the name of the user");
                String name = scanner.next();
                System.out.println("Enter the surname of the user");
                String surname = scanner.next();
                System.out.println("Enter the number of books");
                
                while (!scanner.hasNextInt()) {

                    System.out.println("Please enter only integer value.");

                    scanner.nextLine();
                }
                int books = scanner.nextInt();

                String initials = name.substring(0,1) + surname.substring(0,1);
                users.add(new User(name, surname, initials, books));

                System.out.println("User added successfully");

                for (int i = 0; i < users.size(); i++) {
                    System.out.println(users.get(i).info());
                }
            }else if(action==2){
                int max = 0;
                String name = "";
                for (int i = 0; i < users.size(); i++) {
                    if(users.get(i).books > max){
                        max = users.get(i).books;
                        name = users.get(i).name;
                    }          
                }
                System.out.println("User who read the most books is "+name+ " " +max);
            }else if(action==3){
                
                int min = users.get(0).books;
                String name = "";
                for (int i = 0; i < users.size(); i++) {
                    if(users.get(i).books < min){
                        min = users.get(i).books;
                        name = users.get(i).name;
                    }
                    
                }
            
                
                
                System.out.println("User who read the least books is "+name+" " +  min);
            
         } else if(action==4){
                for (int i = 0; i < users.size(); i++) {

                    System.out.println(users.get(i).info());
                    System.out.println(" ");
                }
            }else if(action==5){
                System.out.println("Exiting the program");
                break;
            }    
    }

    }
}

class User {
    String name;
    String surname;
    String initials;
    int books;
    public User(String name, String surname, String initials, int books) {
        this.name = name;
        this.surname = surname;
        this.initials = initials;
        this.books = books;

    }
    public String info() {
        return  name + " " + surname + " " + initials + " " + books;
    }
    public void addUser(String name,String surname,String initials ,int books){
        this.name = name;
        this.surname = surname;
        this.initials = initials;
        this.books = books;
    }}



    