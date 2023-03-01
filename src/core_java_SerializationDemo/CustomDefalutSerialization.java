package core_java_SerializationDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable{
	String name="Gaurav";
	transient String pass="12345";
	transient int pin=1234;
	
	private void writeObject( ObjectOutputStream oops) throws IOException {
		oops.defaultWriteObject();
		String npss="123"+pass;
		int pin=1234+4444;
		oops.writeObject(npss);
		oops.writeObject(pin);
		
	}
	
	private void readObject( ObjectInputStream oips) throws IOException, ClassNotFoundException {
		oips.defaultReadObject();
		String npss=(String)oips.readObject();
		pass=npss.substring(3);
		System.out.println(npss+" -encrpt pss");
		int pins= (int)oips.readObject();
		System.out.println(pins+" -encrpt pin");
		pin =pins-4444;
		
		
	}
}

public class CustomDefalutSerialization  {
	public static void main(String[] args) throws Exception {
		Account act=new Account();
		System.out.println("User Name is-"+act.name);
		System.out.println("Password is -"+act.pass);
		System.out.println("pin is -"+act.pin);
		FileOutputStream fos=new FileOutputStream("account.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(act);
		
		FileInputStream fis=new FileInputStream("account.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Account acts=(Account) ois.readObject();
		System.out.println("----------Serialization Output---------------");
		System.out.println("User Name is - "+acts.name);
		System.out.println("Password is - "+ acts.pass);
		System.out.println("Password is - "+ acts.pin);
		
		
	}

}
