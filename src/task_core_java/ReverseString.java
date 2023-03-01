package task_core_java;

public class ReverseString {
	
	public static void main(String[] args) {
		String st="Gaurav";
		String nst="";
		char ch;
		for(int i=0;i<st.length();i++) {
			ch=st.charAt(i);
			nst=ch+nst;
		}
		System.out.println("String is "+st);
		System.out.println("Reverse String is "+nst);
	}

}
