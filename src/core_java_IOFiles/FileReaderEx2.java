package core_java_IOFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class FileReaderEx2 {
	public static void main(String[] args) throws IOException {
		File f=new File("File3.txt");
		char[] ch=new char[(int)f.length()];
		FileReader fr=new FileReader(f);
		fr.read(ch);
		for (char c : ch) {
			System.out.print(c);
			
		}
		
	}

}
