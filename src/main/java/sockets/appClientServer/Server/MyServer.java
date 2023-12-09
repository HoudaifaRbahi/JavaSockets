package sockets.appClientServer.Server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8039);
        System.out.println("I'm waiting connexion of client into this server");
        Socket socket = ss.accept();
            do {

                System.out.println("connexion of client has maded successfuly with ip address of" + socket.getReuseAddress());
                InputStream in = socket.getInputStream();
                OutputStream out = socket.getOutputStream();
                int read = in.read();
                System.out.println("I have received your message :" + read);
                int response = read * 2;
                out.write(response);
                System.out.println("I have sent you my response :" + response);
            }while (!socket.isClosed());


    }
}
