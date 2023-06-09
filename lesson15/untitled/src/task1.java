import java.util.ArrayList;
class Day {
  ArrayList<String> lessons = new ArrayList<>();
  public void addLesson(String lesson) {
    lessons.add(lesson);
  }
  public void getDay() {
    if (lessons.isEmpty()) {
      System.out.println("No lessons today");
    } else {
      System.out.println("Number of lessons today: " + lessons.size());
      System.out.println("Lessons today: ");
      for (int i = 0; i < lessons.size() ; i++) {
        System.out.println((i + 1) + ". " + lessons.get(i));
      }}}}
class Monday extends Day {
  public void getDay() {
    System.out.println("Monday");
    super.getDay();
  }}
class Tuesday extends Day {
  public void getDay() {
    System.out.println("Tuesday");
    super.getDay();
  }}
class Wednesday extends Day {
  public void getDay() {
    System.out.println("Wednesday");
    super.getDay();
}}