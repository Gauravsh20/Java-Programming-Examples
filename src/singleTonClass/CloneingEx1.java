package singleTonClass;

class Superclass implements Cloneable{
	
	int a=10;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}

class cloneEx extends Superclass{
	private static cloneEx c1=null;
	private cloneEx() {
		System.out.println("Ram Shiya Ram");
	}
	public static cloneEx getInstance() {
		synchronized (cloneEx.class) {
			if(c1==null) {
				c1=new cloneEx();
			}
		}
		return c1;
	}
}

public class CloneingEx1 {
	public static void main(String[] args) throws CloneNotSupportedException {
		cloneEx c2=cloneEx.getInstance();
		cloneEx c3=(cloneEx) c2.clone();
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());
		System.out.println(c3.a);
		
	}

}
