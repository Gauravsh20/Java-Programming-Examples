package core_java_IOFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderEx {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("File4.txt");
		BufferedReader br= new BufferedReader(fr);
		String line=br.readLine(); 
		while(line!=(null)){  
			System.out.println(line);
			line=br.readLine();
		}
		br.close();
	}

}
