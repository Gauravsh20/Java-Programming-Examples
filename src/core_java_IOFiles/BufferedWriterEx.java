package core_java_IOFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {
	public static void main(String[] args) throws IOException {
		File f=new File("File4.txt");
		f.createNewFile();
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(97);
		bw.newLine();
		char[] ch= {'A','B','C','D','E'};
		bw.write(ch);
		bw.newLine();
		bw.write("Gaurav Sharma");
		bw.newLine();
		bw.write("Infinite Computer Solution");
		bw.flush();
		bw.close();
		
		
	}

}
