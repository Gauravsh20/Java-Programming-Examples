package Core_java_String;

public class MCQ {
	public static void main(String[] args) {
		String sa="A";
		sa=sa.concat("B");
		String sb="C";
		sa=sa.concat(sb);
		sa.replace('C', 'D');
		sa=sa.concat(sb);
		System.out.println(sa);
	}

}
/*
 * 1-ABC 
 * 2-ABCD 
 * 3-ABCC 
 * 4-ABDC 
 * 5-ACD 
 * 6-ABD
 */