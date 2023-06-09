import java.util.LinkedList;

public class Task5 {
    public static void main(String[] args) {
        LinkedList<String> color1 = new LinkedList<String>();

        color1.add("Red");
        color1.add("Green");
        color1.add("Black");
        color1.add("White");
        color1.add("Pink");
        System.out.println("List of first linked list: " + color1);
        LinkedList<String> color2 = new LinkedList<String>();
        color2.add("Red");
        color2.add("Green");
        color2.add("Black");
        color2.add("Pink");
        System.out.println("List of second linked list: " + color2);

        LinkedList<String> all_color = new LinkedList<String>();
        all_color.addAll(color1);
        all_color.addAll(color2);
        System.out.println("New linked list: " + all_color);
    }
}