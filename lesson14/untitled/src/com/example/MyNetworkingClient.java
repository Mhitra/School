package com.example;
import java.net.*;
import java.io.*;
import java.util.Scanner;

public class MyNetworkingClient {
    private Socket socket;
    private DataOutputStream out;

    public MyNetworkingClient(String address, int port) {
        try {
            socket = new Socket(address, port);
            System.out.println("Connected");
            out = new DataOutputStream(socket.getOutputStream());
            try (Scanner input = new Scanner(System.in)) {
                System.out.print("Enter first number: ");
                int num1 = input.nextInt();
                System.out.print("Enter second number: ");
                int num2 = input.nextInt();
                out.writeInt(num1);
                out.writeInt(num2);
            }
                        DataInputStream in = new DataInputStream(socket.getInputStream());
            int result = in.readInt();
            System.out.println("The sum of the two numbers is: " + result);

            System.out.println("Closing connection");
            in.close();
            out.close();
            socket.close();
        } catch (IOException i) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        new MyNetworkingClient("127.0.0.1", 5000);
    }
}
