package singleTonClass;

class Demo{
	private static Demo demo=new Demo();
	private Demo() {
		System.out.println("Hello Gaurav");
	}
	static Demo getDemo() {
		return demo;
	}
	
}

public class SingletonEx {
	public static void main(String[] args) {
		Demo d1=Demo.getDemo();
		Demo d3=Demo.getDemo();
		int d2=d1.hashCode();
		int d4=d3.hashCode();
		System.out.println(d2);
		System.out.println(d4);
	}

}
