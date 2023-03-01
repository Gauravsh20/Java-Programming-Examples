package core_java_Interfaces;

interface InterFace{
	void connected();
	void Disconnected();
}

class Mysql implements InterFace{
	public void connected() {
		System.out.println("Connected Mysql Database.....!");
	}

	public void Disconnected() {
		System.out.println("Disconnected Mysql Database.....!");
		
	}
}
class Oracle implements InterFace{
	public void connected() {
		System.out.println("Connected Oracle Database.....!");
	}

	public void Disconnected() {
		System.out.println("Disconnected Oracle Database.....!");
		
	}
}
public class InterfaceExample {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		InterFace inter=(InterFace)Class.forName("Core_java_Oops.Mysql").newInstance();
		inter.connected();
		inter.Disconnected();
	}

}
