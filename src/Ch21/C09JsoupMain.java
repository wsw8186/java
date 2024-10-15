package Ch21;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.UUID;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class C09JsoupMain {

	public static void main(String[] args) throws IOException, URISyntaxException {
		
		//URL 연결
		Connection conn = Jsoup.connect("https://www.op.gg/champions");
		
		//DOM객체 받기
		Document document = conn.get();
//		System.out.println(document);
		
		//IMG태그 받기
		Elements elements = document.getElementsByTag("img");
//		System.out.println(elements);
		
		for(Element el : elements) {
//			System.out.println(el);
			String img_url = el.getElementsByAttribute("src").attr("src");
			System.out.println(img_url);
			
			URL url = (new URI(img_url)).toURL();
			InputStream in = url.openStream();
			BufferedInputStream buffIn = new BufferedInputStream(in);
			OutputStream out = new FileOutputStream("C:\\TMP_IO\\"+UUID.randomUUID()+".png");
			
			byte [] buff = new byte[4096];
			while(true) {
				int data = buffIn.read(buff);
				if(data==-1)
					break;
				out.write(buff,0,data);
				out.flush();
			}
			out.close();
			buffIn.close();
			in.close();
		}
		
		

	}

}
