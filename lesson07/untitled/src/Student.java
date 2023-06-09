public class Student {
    private String name;
    private String surname;
    private int ID;
    private String fieldOfStudy;
    int yearOfEnrollment;
    public Student(String name, String surname, int ID, String fieldOfStudy, int yearOfEnrollment) {
        this.name = name;
        this.surname = surname;
        this.ID = ID;
        this.fieldOfStudy = fieldOfStudy;
        this.yearOfEnrollment = yearOfEnrollment;    
    }
    public int yearOfStudy(int yearOfEnrollment) {
        return 2022 - yearOfEnrollment;    
    }
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("ID: " + ID);
        System.out.println("Field of Study: " + fieldOfStudy);
        System.out.println("Year of Enrollment: " + yearOfEnrollment);
        System.out.println("Year of Study: " + yearOfStudy(yearOfEnrollment));
    }
    }




