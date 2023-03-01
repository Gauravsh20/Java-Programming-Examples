package singleTonClass;

class Classic{
	
	private static Classic c1;
	
	private Classic() {
		System.out.println("Classic Method");
		
	}
	
	//Classic Implementation
	public static Classic getClassic() { 
		
	//make get method Synchronized
  //public static synchronized Classic getClassic() { 
		
		if(c1==null) {
			
			//use Double Checked Locking
			/*
			 * synchronized (Classic.class) { c1=new Classic(); }
			 */
			c1=new Classic();
		}
		return c1;
	}
	
}
public class SinletonclassClassicM {
	public static void main(String[] args) {
		Classic c2=Classic.getClassic();
		
		
	}

}
