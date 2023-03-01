package core_java_IOFiles;

import java.io.File;
import java.io.IOException;

public class IOFilesEx1 {
	public static void main(String[] args) throws IOException {
		File file=new File("File1.txt");
		System.out.println(file.exists());
		file.createNewFile();
		System.out.println(file.exists());
		
		
	}

}
