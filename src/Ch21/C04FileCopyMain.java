package Ch21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class C04FileCopyMain {

	private static final String DIR = "C:\\TMP_IO\\";
	
	public static void main(String[] args) throws Exception {
		
		InputStream in = new FileInputStream(DIR+args[0]);
		OutputStream out = new FileOutputStream(DIR+args[1]);

		while(true) {
			int data = in.read();
			if(data==-1)
				break;
			out.write(data);
			out.flush();
		}
		in.close();
		out.close();
	}

}
