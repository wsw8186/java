package Ch21;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class C02FileCopyMain {

	private static final String DIR = "C:\\TMP_IO\\";
	
	//명령어 원본경로 지정대상경로
	public static void main(String[] args) throws IOException {
		
		for(String arg:args)
			System.out.println(arg);
		
		Reader in = new FileReader(DIR+args[0]);
		Writer out = new FileWriter(DIR+args[1]);
		
		while(true) {
			int data = in.read();
			if(data==-1)
				break;
			out.write((char)data);
			out.flush();
		}
		
		in.close();
		out.close();
	}	
}
