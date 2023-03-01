package Core_java_String;

import java.security.PublicKey;

public class ExCharAt {

	public static void main(String[] args) {
		String s1=new String("Gaurav");
		System.out.println(s1.charAt(3));
		/* System.out.println(s1.charAt(30)); */ //StringIndexOutofBound Error Show
		
		System.out.println(s1.concat(" Sharma"));
		/* System.out.println(s1+=" Sharma"); */
		
		String s2=new String("GAURAV");
		System.out.println(s1.equals(s2));//include letter cases
		
		System.out.println(s1.equalsIgnoreCase(s2));// not include letter cases
		
		
		String s3="";
		System.out.println("String is Empty -"+s3.isEmpty());//check string is empty or not?
		
		
		
		System.out.println(s1.length());//String applied for length method ----s1.length()
		//length veriable for array's---a.length
		
		s1.replace('a', 'b');
		System.out.println(s1.replace('a', 'b'));//All 'a' replace to 'b'
		
		
		System.out.println(s1.substring(2));//being index value provide and last index value
		System.out.println(s1.substring(2,4));
		
		System.out.println(s1.indexOf('a'));//find index value
		System.out.println(s1.indexOf('x'));//index value not found so return is -1;
		
		System.out.println(s1.lastIndexOf('a'));//last index value return 
		

	}

}
