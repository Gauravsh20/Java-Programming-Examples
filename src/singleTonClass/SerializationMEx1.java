package singleTonClass;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SerialDemo implements Serializable{
	private static SerialDemo st=new SerialDemo();
	private SerialDemo() {
		System.out.println("Serialization Method...");
		String s1="gaurav";
		System.out.println(s1);
	}
	public static SerialDemo getserial() {
		return st;
	}
}

public class SerializationMEx1 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		SerialDemo st1=SerialDemo.getserial();
		ObjectOutput oou=new ObjectOutputStream(new FileOutputStream("File.txt"));
		oou.writeObject(st1);
		oou.close();
		
		ObjectInput oio=new ObjectInputStream(new FileInputStream("File.txt"));
		SerialDemo st2=(SerialDemo) oio.readObject();
		st2.getserial();
		oio.close();
		
		
	}

}
