import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;

class berkay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of orders: ");
        int numOrders = scanner.nextInt();
        scanner.nextLine();

        Order[] orders = new Order[numOrders];
        HashMap<String, Integer> clientOrderCount = new HashMap<>();

        for (int i = 0; i < numOrders; i++) {
            System.out.println("Enter the name of the client: ");
            String client = scanner.nextLine();
            System.out.print(client);
            if (client == null) {
                System.out.println("Error: Client name cannot be null.");
                continue;
            }
            System.out.println("Enter the number of the order: ");
            int numOrder = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter the item: ");
            String item = scanner.nextLine();
            System.out.println("Enter the price: ");
            int price = scanner.nextInt();
            scanner.nextLine();
            orders[i] = new Order(client, numOrder, item, price);

            clientOrderCount.put(client, clientOrderCount.getOrDefault(client, 0) + 1);
        }
        System.out.println("Enter the number of the task: ");
        System.out.println("1. The client who has the largest number of orders");
        System.out.println("2. List of orders of in descending order of the prices");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            String clientWithMaxOrders = "";
            int maxOrderCount = 0;
            for (String client : clientOrderCount.keySet()) {
                if (clientOrderCount.get(client) > maxOrderCount) {
                    maxOrderCount = clientOrderCount.get(client);
                    clientWithMaxOrders = client;
                }
            }
            System.out.println("The client who has the largest number of orders is " + clientWithMaxOrders);
            System.out.println("Their orders are: ");
            for (Order order : orders) {
                if (order.getClient().equals(clientWithMaxOrders)) {
                    System.out.println(
                            "Client: " + order.getClient() + ", Item: " + order.getItem() + ", Price: " + order.getPrice());
                }
            }
        } else if (choice == 2) {
            Arrays.sort(orders, (o1, o2) -> o2.getPrice() - o1.getPrice());
            System.out.println("Orders sorted by price in descending order: ");
            for (Order order : orders) {
                System.out.println(
                        "Client: " + order.getClient() + ", Item: " + order.getItem() + ", Price: " + order.getPrice());


            }
        }
    }
}

class Order {
    private String client;
    private int numOrder;
    private String item;
    private int price;

    public Order(String client, int numOrder, String item, int price) {
        this.client = client;
        this.numOrder = numOrder;
        this.item = item;
        this.price = price;
    }

    public int getNumOrder() {
        return numOrder;
    }

    public String getClient() {
        return client;
    }

    public int getPrice() {
        return price;
    }

    public String getItem() {
        return item;
    }

}