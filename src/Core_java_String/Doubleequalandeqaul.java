package Core_java_String;

public class Doubleequalandeqaul {

	public static void main(String[] args) {
		String st1=new String("Gaurav");
		String st2=new String ("Gaurav");
		System.out.println(st1==st2);//Reference/address of the object
		System.out.println(st1.equals(st2));//Content must be same bcz overriding the 
		//object .equal method(Reference/address of the object check) by String .equals method
		//(Content will check) 
		System.out.println("----------------------------------------------------");
		StringBuffer stb1=new StringBuffer("Sharma");
		StringBuffer stb2=new StringBuffer("Sharma");
		System.out.println(stb1==stb2);//Reference/address of the object
		System.out.println(stb1.equals(stb2));//in this reference will check bcz not override the method

	}

}
