package core_java_IOFiles;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidationd {
	public static void main(String[] args) {
		Pattern p=Pattern.compile("[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}");
		Matcher m=p.matcher("mkyong11-100@yahoo.com");
		boolean b=m.matches();
		System.out.println(b);
	}

}
