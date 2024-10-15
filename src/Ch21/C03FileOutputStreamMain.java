package Ch21;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class C03FileOutputStreamMain {

	public static void main(String[] args) throws Exception {
		
		OutputStream fout = new FileOutputStream("C:\\TMP_IO\\test.txt");
		fout.write("가".getBytes(StandardCharsets.UTF_8));
		fout.write('a');
		fout.write('b');
		fout.write('c');
		fout.write('d');
		fout.flush();
		fout.close();
	}

}
