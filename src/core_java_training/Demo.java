package core_java_training;



class Test1{
	int a;

}
public class Demo{
	public static void main(String[] args)
	
	{
		int b = 0;
		Test1 ts=new Test1();
		System.out.println(System.identityHashCode(ts.a));
		System.out.println(System.identityHashCode(b));
		
	}
}

