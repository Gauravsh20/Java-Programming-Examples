package core_java_SerializationDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Order know 
class Dogs implements Serializable{
	String name="Dogs----";
	int age=5;
	
}

class Cat implements Serializable{
	String name="Cat---";
	int age =2;
}

class Rat implements Serializable{
	String name="Rat---";
	int age=1;
}

public class MultiSerialEx {
	public static void main(String[] args) throws Exception {
		Dogs dogs=new Dogs();
		Cat cat=new Cat();
		Rat rat=new Rat();
		
		FileOutputStream fos=new FileOutputStream("pets.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(dogs);
		oos.writeObject(cat);
		oos.writeObject(rat);
		
		FileInputStream fis=new FileInputStream("pets.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dogs dogs1=(Dogs) ois.readObject();
		Cat cats1=(Cat) ois.readObject();
		Rat rat1=(Rat) ois.readObject();
		
		System.out.println("----------Dog Object-----");
			System.out.println(dogs1.name);
			System.out.println(dogs1.age);
		
		
		System.out.println("----------Cat Object-----");
			System.out.println(cats1.name);
			System.out.println(cats1.age);
		
		
		System.out.println("----------Rat Object-----");	
			System.out.println(rat1.name);
			System.out.println(rat1.age);
	}

}
