package singleTonClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SerialDemo1 implements Serializable{
	private static SerialDemo1 s1=null;
	private SerialDemo1() {
		System.out.println("Hello");
	}
	public static SerialDemo1 getInstance() {
		synchronized (SerialDemo1.class) {
			if (s1==null) {
				s1=new SerialDemo1();
			}
		}
		return s1;
	}
}


public class SerialEx2 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		SerialDemo1 s2=SerialDemo1.getInstance();
		
		//serialization Proccess
		
		ObjectOutput oou=new ObjectOutputStream(new FileOutputStream("File5.txt"));
		oou.writeObject(s2);
		oou.close();
		
		//Deserialization
		
		
		ObjectInput ooi=new ObjectInputStream(new FileInputStream("File5.txt"));
		SerialDemo1 s3=(SerialDemo1) ooi.readObject();
		SerialDemo1.getInstance();
		ooi.close();
		
		
		
	}

}
