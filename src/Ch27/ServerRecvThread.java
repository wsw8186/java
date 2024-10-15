package Ch27;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class ServerRecvThread implements Runnable {
	
	Sgui sgui; 
	Socket client;
	DataInputStream din;
	
	public ServerRecvThread(Sgui sgui, Socket client) {
		this.sgui = sgui;
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
				sgui.area.append("[CLIENT] " + recv + "\n");
			}
			System.out.println("[SERVER] 수신 종료");
			sgui.area.append("[CLIENT] 와의 연결을 종료합니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
