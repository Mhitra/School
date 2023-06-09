import java.util.Scanner;
class Student {
String name ;
String surname;
int age;
String fieldOfStudy;
int groupNumber;
Student(String name, String surname, int age, String fieldOfStudy, int groupNumber) {
this.name = name;
this.surname = surname;
this.age = age;
this.fieldOfStudy = fieldOfStudy;
this.groupNumber = groupNumber;
}public static void main(String[ ] args) { 
Student student1 = new Student("Ivan", "Ivanov", 19, "Java", 1);
Student student2 = new Student("Petr", "Petrov", 20, "JavaScript", 2);
Student student3 = new Student("Sidor", "Sidorov", 21, "Python", 3);
Student student4 = new Student("Peter", "Parker", 16, "C++", 4);
Student student5 = new Student("Adam", "Smith ", 20, "C", 5);
Student student6 = new Student("Asura", "Astral", 21, "C#", 6);
Student student7 = new Student("Tom", "And Jerry", 18, "Math", 7);
Student student8 = new Student("Mhitra", "Skyfall", 20, "Computer Sciene", 8);
Student student9 = new Student("Aden", "Bia Algos", 20, "Graphic", 9);
Student student10 = new Student("Mona", "", 1, "Space", 10);
Student[] students = {student1, student2, student3, student4, student5, student6, student7, student8, student9, student10};
System.out.println("---------------------------------");
System.out.println("All students: ");
System.out.println("Name | Surname | Age | FieldOfStudy | GroupNumber");
for (int i = 0; i < students.length; i++) {
    studentInfo(students[i]);

}
System.out.println("---------------------------------");


System.out.println();
System.out.println("Students younger than 20 y.o.: ");
for (int i = 0; i < students.length; i++) {
    if (students[i].age < 20) {
        for (int j = i + 1; j < students.length; j++) {
            if (students[j].age < 20) {
                if (students[i].age > students[j].age) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
 }}}
 System.out.println(students[i].name + " " + students[i].surname + " " + students[i].age );
}}
System.out.println("---------------------------------");

System.out.println("Students in alphabetical order: ");
for (int i = 0; i < students.length; i++) {
    for (int j = i + 1; j < students.length; j++) {
        if (students[i].name.compareTo(students[j].name) > 0) {
            Student temp = students[i];
            students[i] = students[j];
            students[j] = temp;
 }}
System.out.println(students[i].name);

}
System.out.println("---------------------------------");

}
public static void studentInfo(Student student) {
System.out.println(student.name + " " + student.surname + " " + student.age + " " + student.fieldOfStudy + " " + student.groupNumber );   
}
}