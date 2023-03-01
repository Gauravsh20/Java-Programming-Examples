package singleTonClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class ClassLoderDemo{
	public static ClassLoderDemo c1=new ClassLoderDemo();
	private ClassLoderDemo() {
		System.out.println("Gaurav Sharma");
	}
	public static ClassLoderDemo getInstance() {
		return c1;
		
	}
}
public class ClassloaderEx extends ClassLoader {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		ClassLoderDemo c2=ClassLoderDemo.getInstance();
		ClassloaderEx cl=new ClassloaderEx();
		Class<?> cls=cl.loadClass("singleTonClass.ClassLoderDemo");
		Constructor[] cnst=cls.getDeclaredConstructors();
		ClassLoderDemo c3=null;
		for (Constructor constructor : cnst) {
			constructor.setAccessible(true);
			c3=(ClassLoderDemo) constructor.newInstance();
			
		}
		c3.getInstance();
		
	}

}
