package core_java_RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REEx1 {
	public static void main(String[] args) {
		
		  Pattern p=Pattern.compile("......s"); 
		  Matcher m=p.matcher("Gauravs"); 
		  boolean b=m.matches(); 
		  System.out.print(b);
		  
		 
		boolean a = Pattern.compile("..e").matcher("the").matches();
		System.out.print(a);

		boolean b3 = Pattern.matches(".s", "as");
		System.out.print(b3);

	}

}
