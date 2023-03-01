package Core_java_String;

public class HeapandScp {
	public static void main(String[] args) {
		String s1=new String("Spring");
		s1.concat("Fall");
		String s2=s1.concat("Winter");
		s2.concat("Summer");
		System.out.println(s1);
		System.out.println(s2);
	}

}

//heap area=1+1
//SCP=1+1+1