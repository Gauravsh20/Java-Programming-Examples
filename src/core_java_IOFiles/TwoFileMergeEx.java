package core_java_IOFiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class TwoFileMergeEx {
	public static void main(String[] args) throws IOException {
		PrintWriter pw=new PrintWriter("File1.txt");
		BufferedReader br=new BufferedReader(new FileReader("File3.txt"));
		String line1=br.readLine();
		while(line1!=null) {
			pw.print(line1+'\n');
			System.out.println(line1);
			line1=br.readLine();
		}
		BufferedReader br1=new BufferedReader(new FileReader("File4.txt"));
		String line2=br1.readLine();
		while(line2!=null) {
			pw.print(line2+'\n');
			System.out.println(line2);
			line2=br1.readLine();
		}
		pw.flush();
	}

}
