package core_java_SerializationDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable{
	int i=10;
//	transient int j=20;
	transient static int a=40;
	int k=20;
	
}

public class SerializationExample {

	public static void main(String[] args) throws Exception {
		Dog d1=new Dog();
		
		FileOutputStream fos=new FileOutputStream("abs.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		FileInputStream fis=new FileInputStream("abs.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog d2=(Dog) ois.readObject();
		System.out.println(d2.i+"----"+d2.k+"----"+d2.a);
		

	}

}
