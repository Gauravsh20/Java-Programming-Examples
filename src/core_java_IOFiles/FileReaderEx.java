package core_java_IOFiles;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
	public static void main(String[] args) throws IOException {
		FileReader fr= new FileReader("File3.txt");
		int num=fr.read();
		while(num!=-1) {
			System.out.print((char)num);
			num=fr.read();
		}
		
	}

}
