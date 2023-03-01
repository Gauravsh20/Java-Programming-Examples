package core_java_IOFiles;

import java.io.File;
import java.io.IOException;

public class FileConstructorEx {
	public static void main(String[] args) throws IOException {
		File f=new File("Gaurav123");
		f.mkdir();
		System.out.println(f.exists());
		File f1=new File("File2.txt");// create a file same CWD(current Working Dir.)
		/* File f1=new File(f,"File2.txt");*/ // file2.txt in f file create
		/* File f1=new File("Gaurav123","File2.txt"); */ //Gaurav123 Dir create a file file2.txt
		f1.createNewFile();
		System.out.println(f1.exists());
		String[] list=f.list();
		for (String string : list) {
			System.out.println(string);
			
		}
	}

}
