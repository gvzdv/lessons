package lesson16.printApp;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

public class PrintServer {
    private int port;

    public PrintServer(int port) {
        this.port = port;
    }

    public void getMessage(Socket socket) {
        try (ObjectInputStream objIn = new ObjectInputStream(socket.getInputStream())) {
            Object object = objIn.readObject();

            printMessage((Message)object);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

public void printMessage(Message message){
    System.out.println("message: " + message.getMessText() + " from " + message.getSender());
}

    public void start() {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server started on: " + serverSocket);

            while (true) {
                Socket socket = serverSocket.accept();
                getMessage(socket);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        int port = Integer.parseInt(args[0]);
        PrintServer server = new PrintServer(port);
        server.start();
    }

}
