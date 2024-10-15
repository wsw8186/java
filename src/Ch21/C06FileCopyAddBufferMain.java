package Ch21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class C06FileCopyAddBufferMain {

	private static final String DIR = "C:\\TMP_IO\\";
	
	public static void main(String[] args) throws Exception {
		
		InputStream in = new FileInputStream(DIR+args[0]);
		OutputStream out = new FileOutputStream(DIR+args[1]);

		byte [] buffer = new byte[4096];
		
		long sTime = System.currentTimeMillis();
		
		while(true) {
			int data = in.read(buffer);
			if(data==-1)
				break;
			out.write(buffer,0,data);
			out.flush();
		}
		
		long eTime = System.currentTimeMillis();
		System.out.println("소요시간 : " + (eTime - sTime) +  "ms");
		
		in.close();
		out.close();
	}

}
