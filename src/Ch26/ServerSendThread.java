package Ch26;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ServerSendThread implements Runnable {

	Socket client;
	Scanner sc;
	DataOutputStream dout;
	
	public ServerSendThread(Socket client) {
		this.client = client;
		this.sc = new Scanner(System.in);
	}

	@Override
	public void run() {
		try {
			dout = new DataOutputStream(client.getOutputStream());
			String send = null;
			while(true) {
				System.out.print("[SERVER(q:종료)] : ");
				send=sc.nextLine();
				dout.writeUTF(send);
				dout.flush();
				if(send.equals("q"))
					break;
			}
			System.out.println("[INFO] 송신 종료합니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
