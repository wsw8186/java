package Ch26;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientSendThread implements Runnable {
	
	Socket server;
	Scanner sc;
	DataOutputStream dout;
	
	
	public ClientSendThread(Socket server) {
		this.server = server;
		this.sc = new Scanner(System.in);
	}

	@Override
	public void run() {
		try {
			dout = new DataOutputStream(server.getOutputStream());
			String send = null;
			while(true) {
				System.out.print("[CLIENT(q:종료)] : ");
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
