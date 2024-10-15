package Ch26;

import java.io.DataInputStream;
import java.net.Socket;

public class ClientRecvThread implements Runnable {
	
	Socket server;
	DataInputStream din;

	public ClientRecvThread(Socket server) {
		this.server = server;
		
	}

	@Override
	public void run() {
		try {
			din = new DataInputStream(server.getInputStream());
			String recv = null;
			while(true) {
				recv = din.readUTF();
				if(recv.equals("q")||recv==null)
					break;
				System.out.println("[SERVER] : " + recv);
			}
			System.out.println("[INFO] 수신 종료합니다.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
