package singleTonClass;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Demo2{
	private static Demo2 demo2=new Demo2();
	private Demo2() {
	        System.out.println("Hello Gaurav");
	}
	public static Demo2 getDemo2() {
		return demo2;
	}
	
}

public class ReFlectionEx2 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		 Demo2 d1=Demo2.getDemo2();
		Constructor[] cont=Demo2.class.getDeclaredConstructors();
		for (Constructor constructor : cont) {
			//System.out.println(constructor);
			constructor.setAccessible(true);
			Demo2 d3=(Demo2)constructor.newInstance();
			System.out.println(d3.hashCode());
		}
		System.out.println(d1.hashCode());
			
	}

}
