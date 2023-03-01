package singleTonClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class ReflectionEx{
	private static ReflectionEx r1=null;
	String s;
	private  ReflectionEx() {
		s="today is Good Day";
		System.out.println(s);
	}
	public static ReflectionEx getinstance() {
		synchronized(ReflectionEx.class) {
			if(r1==null) {
				r1=new ReflectionEx();
			}
		}
		return r1;
	}
}

public class ReflectionEx3 {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		ReflectionEx r2=ReflectionEx.getinstance();
		ReflectionEx r5=ReflectionEx.getinstance();
		Constructor[] cons=ReflectionEx.class.getDeclaredConstructors();
		for (Constructor constructor : cons) {
			constructor.setAccessible(true);
			ReflectionEx r3=(ReflectionEx) constructor.newInstance();
			ReflectionEx r4=(ReflectionEx) constructor.newInstance();
			r3.getinstance();
			System.out.println(r3.hashCode());
			System.out.println(r4.hashCode());
		}
		System.out.println(r2.hashCode());
		System.out.println(r5.hashCode());

	}

}
