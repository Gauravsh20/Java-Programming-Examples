package Core_java_inheritance;

class InhertA{
	public void I(double a){
		System.out.println("Radhe");
	}
	
}
class InhertB extends InhertA{
	public void I(int a){
		System.out.println("shayam");
	}
	
}

class InhertC extends InhertA{
	public void I(){
		System.out.println("Krishna");
	}
}
public class Ex_Multiple {
	public static void main(String[] args) {
		InhertA a=new InhertA();
		InhertA ab=new InhertB();
		InhertB b=new InhertB();
		InhertA c=new InhertC();
		/* a.I(); */
		ab.I(10.f);
		/*
		 * b.I(); c.I();
		 */
		
	}
	

}
