public class Employee
{
    private String name;
    private String surname;
    private int idNumber;
    private int phonenumber ;
    private String adress;
    public Employee()
    {
        name = "";
        surname = "";
        idNumber = 0;
        phonenumber = 0;
        adress = "";
    }
    public Employee(String name, String surname, int idNumber, int phonenumber, String adress)
    {
        this.name = name;
        this.surname = surname;
        this.idNumber = idNumber;
        this.phonenumber = phonenumber;
        this.adress = adress;
    }

    public void printInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("ID: " + idNumber);
        System.out.println("Phone Number: " + phonenumber);
        System.out.println("Adress: " + adress);
    }
    public void talk()
    {
        System.out.println("Hello, my name is " + name + " " + surname + " and my ID is " + idNumber + " and my phone number is " + phonenumber
                + " and my adress is " + adress);
    }
}