package core_java_IOFiles;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

public class PrintWriterEx {
	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pw=new PrintWriter("File4.txt");
		pw.print(100 +'\n');
		pw.print("Gaurav \n");
		pw.write('A');
		pw.print('\n');
		pw.print(true);
		pw.print('\n');
		pw.print(10.20);
		pw.print('\n');
		pw.close();
		
	}

}
