package Ch26;

import java.io.DataInputStream;
import java.net.Socket;

public class ServerRecvThread implements Runnable {
	
	Socket client;
	DataInputStream din;
	
	
	public ServerRecvThread(Socket client) {
		this.client = client;
	}

	@Override
	public void run() {
		try {
			din = new DataInputStream(client.getInputStream());
			String recv = null;
			while(true) {
				recv = din.readUTF();
				if(recv.equals("q")||recv==null)
					break;
				System.out.println("[CLIENT] : " + recv);
			}
			System.out.println("[INFO] 수신 종료합니다.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}

}
