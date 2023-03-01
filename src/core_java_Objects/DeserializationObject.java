package core_java_Objects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dobject implements Serializable{
	void fun() {
		System.out.println("Hello..! Gaurav");
	}
	
}

public class DeserializationObject {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Dobject obj=new Dobject();
		obj.fun();
		System.out.println(obj.hashCode());
		
		File f=new File("obj.txt");
		FileOutputStream fos= new FileOutputStream(f);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(obj);
		
		
		FileInputStream fis=new FileInputStream(f);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dobject obj2=(Dobject) ois.readObject();
		System.out.println(obj2);
		System.out.println(obj2.hashCode());
		

	}

}
