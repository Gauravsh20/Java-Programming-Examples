package core_java_wrapper;

public class Unboxing {
	     
	public static void main(String args[]){    
	//Converting Integer to int    
	Integer a=new Integer(3);    
	int i=a.intValue();//converting Integer to int explicitly  
	int j=a;//unboxing, now compiler will write a.intValue() internally    
	    
	System.out.println(a+" "+i+" "+j);    
	}}    
// convert object into primitives  
//Unboxing example of Integer to int 