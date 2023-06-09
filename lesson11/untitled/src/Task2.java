import java.util.LinkedList;

public class Task2 {
    private LinkedList<Integer> queue;

    public Task2() {
        queue = new LinkedList<Integer>();
    }

    // Add an item to the end of the queue
    public void add(int item) {
        queue.addLast(item);
    }

    // Delete the first item of the queue
    public void remove() {
        if (!queue.isEmpty()) {
            queue.removeFirst();
        }
    }

    // Returns the first item of the queue
    public int peek() {
        if (!queue.isEmpty()) {
            return queue.getFirst();
        }
        return -1;
    }

    // Returns the number of items in the queue
    public int size() {
        return queue.size();
    }

    // Returns the minimum item in the queue
    public int min() {
        if (!queue.isEmpty()) {
            int min = queue.getFirst();
            for (int item : queue) {
                if (item < min) {
                    min = item;
                }
            }
            return min;
        }
        return -1;
    }

    // Returns the maximum item in the queue
    public int max() {
        if (!queue.isEmpty()) {
            int max = queue.getFirst();
            for (int item : queue) {
                if (item > max) {
                    max = item;
                }
            }
            return max;
        }
        return -1;
    }

    // Find an item in the queue
    public boolean find(int item) {
        return queue.contains(item);
    }

    // Prints all items in the queue
    public void print() {
        for (int item : queue) {
            System.out.print(item + " ");
        }
    }
    // Find an item

}
