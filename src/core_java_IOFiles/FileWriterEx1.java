package core_java_IOFiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx1 {
	public static void main(String[] args) throws IOException {
		File file= new File("File3.txt");
		file.createNewFile();
		FileWriter fw=new FileWriter(file);
		char[] ch={'A','B','C','D'};
		fw.write(100);
		fw.write('d');
		fw.write('\n');
		fw.write("Gaurav");
		fw.write('\n');
		fw.write(ch);
		fw.close();
		
		
	}

}
