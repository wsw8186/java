package Ch26;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientMain {
	public static void main(String[] args) throws Exception {
		
		Socket server = new Socket("192.168.5.17",9000);
		
		ClientRecvThread recv = new ClientRecvThread(server);
		ClientSendThread send = new ClientSendThread(server);
		
		Thread th1 = new Thread(recv);
		Thread th2 = new Thread(send);
		
		th1.start();
		th2.start();
		
		th1.join();
		th2.join();
	}
}
