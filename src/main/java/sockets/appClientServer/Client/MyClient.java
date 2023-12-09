package sockets.appClientServer.Client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyClient {
    public static void main(String[] args) throws IOException {
      System.out.println("I will connect into the server");
      Socket socket=new Socket("localhost",8039);
      InputStream inputStream=socket.getInputStream();
      OutputStream outputStream=socket.getOutputStream();
      Scanner scanner=new Scanner(System.in);
      int response=scanner.nextInt();
      outputStream.write(response);
      System.out.println("I have sent you my message :"+response);
      int read=inputStream.read();
      System.out.println("I have have received  you answer :"+read);
      socket.close();
    }
}
