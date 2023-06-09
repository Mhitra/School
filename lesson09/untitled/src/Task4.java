import java.util.List;

import java.util.LinkedList;

public class Task4 {

    public static void main(String[] args) {

        List<Integer> numbers = new LinkedList<>();
       
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);

        System.out.println("List: " + numbers);

        numbers.remove(2);
        System.out.println("List: " + numbers);

        numbers.set(2, 10);
        System.out.println("List: " + numbers);

        System.out.println("List size : " + numbers.size());

        int min = numbers.get(0);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }
        }
        System.out.println("list min: " + min);

        int max = numbers.get(0);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        System.out.println("list max: " + max);

        if (numbers.contains(10)) {
            System.out.println("list has 10");
        } else {
            System.out.println("list does not have 10");
        }

        System.out.println("List: " + numbers);

    }

}