import java.io.*;
import java.net.*;
public class TCPClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);
            BufferedReader input = new BufferedReader(
                new InputStreamReader(socket.getInputStream())
            );
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader console = new BufferedReader(
                new InputStreamReader(System.in)
            );
            String clientMsg, serverMsg;
            while (true) {
                System.out.print("Client: ");
                clientMsg = console.readLine();
                output.println(clientMsg);
                if (clientMsg.equalsIgnoreCase("exit")) {
                    break;
                }
                serverMsg = input.readLine();
                System.out.println("Server: " + serverMsg);
            }
            socket.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}