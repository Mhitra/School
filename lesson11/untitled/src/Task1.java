import java.util.ArrayList;

public class Task1 {
    private ArrayList<Integer> stack;

    public Task1() {
        stack = new ArrayList<Integer>();
    }

    // Add an item to the top of the stack
    public void push(int item) {
        stack.add(item);
    }
    
    public void pull(int item) {
        stack.remove(item);
        }


    // Delete the top item of the stack
    public void pop() {
        if (!stack.isEmpty()) {
            stack.remove(stack.size() - 1);
        }
    }
    // Find an item
    

    //print all items
    public String toString() {
        return stack.toString();
    }

    // Returns the top item of the stack
    public int peek() {
        if (!stack.isEmpty()) {
            return stack.get(stack.size() - 1);
        }
        return -1;
    }

    // Returns the number of items in the stack
    public int size() {
        return stack.size();
    }

    // Returns the minimum item in the stack
    public int min() {
        if (!stack.isEmpty()) {
            int min = stack.get(0);
            for (int item : stack) {
                if (item < min) {
                    min = item;
                }
            }
            return min;
        }
        return -1;
    }

    // Returns the maximum item in the stack
    public int max() {
        if (!stack.isEmpty()) {
            int max = stack.get(0);
            for (int item : stack) {
                if (item > max) {
                    max = item;
                }
            }
            return max;
        }
        return -1;
    }

    // Find an item in the stack
    public boolean find(int item) {
        return stack.contains(item);
    }

    // Prints all items in the stack
    public void print() {
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.print(stack.get(i) + " ");
        
    }
    //
    }

}

