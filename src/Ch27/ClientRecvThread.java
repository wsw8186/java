package Ch27;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientRecvThread implements Runnable {
	
	Cgui cgui; 
	Socket server;
	DataInputStream din;
	
	public ClientRecvThread(Cgui cgui, Socket server) {
		this.cgui = cgui;
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
				cgui.area.append("[SERVER] " + recv + "\n");
			}
			System.out.println("[CLIENT] 수신 종료");
			cgui.area.append("[SERVER] 와의 연결을 종료합니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
