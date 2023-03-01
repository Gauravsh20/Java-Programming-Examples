package core_java_Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx1 {
	public static void main(String[] args) throws IOException {
		Properties pr=new Properties();
		FileInputStream fis=new FileInputStream("abc.properties");
		pr.load(fis);
		
		System.out.println(pr);
		String str=pr.getProperty("Gaurav");
		String str1=(String) pr.setProperty("Gaurav","23");
		pr.setProperty("Gauravsharma","2333");
		System.out.println(str);
		FileOutputStream fio=new FileOutputStream("abc.properties");
		pr.store(fio, "Gaurav Is good");
		
		
		
	}

}
