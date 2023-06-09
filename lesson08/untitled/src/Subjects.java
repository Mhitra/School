// Write a program that would help user to check the list of subjects for certain field of study. Program should have ‘Subjects’ class with list of different study subjects. While creating the object fieldOfStudy of‘Subjects’ class name of field of study shoud be passed, and the program will print the list of several subjects for every particular field. If no name is passed while creating an object of ‘Subjects’ class, then the answer should be "Unknown"

public class Subjects {

    private String fieldOfStudy;

    public Subjects(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void printSubjects() {
        if(fieldOfStudy.equals("computer science") || fieldOfStudy.equals("1")) {
            System.out.println("Math, Physics, Programming, English");
        } else if(fieldOfStudy.equals("medicine")   || fieldOfStudy.equals("2")) {
            System.out.println("Biology, Chemistry, Anatomy, English");
        } else if(fieldOfStudy.equals("law")    || fieldOfStudy.equals("3")) {
            System.out.println("History, Philosophy, English, Logic");
        } else {
            System.out.println("Unknown");
        }
    }
}
    

















