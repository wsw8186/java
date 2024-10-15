package Ch19;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class C06PropertiesMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		

		//프로젝트 경로 확인
		String dirPath = System.getProperty("user.dir");
		System.out.println(dirPath);
		//클래스 경로 확인
		String classPath = System.getProperty("java.class.path");
		System.out.println(classPath);
		//패키지 경로
		String packagePath = C06PropertiesMain.class.getPackageName();
		System.out.println(packagePath);
		
		//파일경로
		String filePath=dirPath+File.separator+"src"+File.separator+packagePath+File.separator+"application.properties";
		FileInputStream fin = new FileInputStream(filePath);
		
		Properties properties = new Properties();
		properties.load(fin);
		
		String url=properties.getProperty("url");
		String username=properties.getProperty("username");
		String password=properties.getProperty("password");
		System.out.printf("%s %s %s\n", url,username,password);
	}

}
