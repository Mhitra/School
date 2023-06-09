package com.example;
import java.net.*;
import java.io.*;

public class MyNetworkingServer {
    private Socket socket;
    private ServerSocket server;
    private DataInputStream in;
    private DataOutputStream out;

    public MyNetworkingServer(int port) {
        try {
            server = new ServerSocket(port);
            System.out.println("Server started");
            System.out.println("Waiting for a client");
            socket = server.accept();
            System.out.println("Client accepted");
            in = new DataInputStream(socket.getInputStream());
            int n1 = in.readInt();
            int n2 = in.readInt();
            int result = n1 + n2;
            out = new DataOutputStream(socket.getOutputStream());
            out.writeInt(result);
            System.out.println("The sum of the two numbers is: " + result);

            socket.close();
            in.close();
            out.close();
        } catch (IOException i) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        new MyNetworkingServer(5000);
    }
}
