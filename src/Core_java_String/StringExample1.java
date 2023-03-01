package Core_java_String;

public class StringExample1 {

	public static void main(String[] args) {
		String st=new String("Gaurav");
		st.concat("Sharma");//create a new object---perform and go to garbage collection bcz not have any reference variable
		//String is immutable
		System.out.println(st);
		System.out.println(st.concat("Sharma"));

	}

}
