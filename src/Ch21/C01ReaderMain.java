package Ch21;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class C01ReaderMain {

	public static void main(String[] args) throws IOException {
		
		Reader fin = new FileReader("C:\\TMP_IO\\test1.txt");
		StringBuffer buffer = new StringBuffer();
		int data = 0;
		while((data = fin.read())!=-1) {
//			int data = fin.read();
//			if(data==-1)
//				break;
//			System.out.print((char)data);
			buffer.append((char)data);
		}
		System.out.println(buffer);
		fin.close();
	}

}
