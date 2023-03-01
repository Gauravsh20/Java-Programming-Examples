package core_java_Feature8;

interface hello{
	void sayhello();
}

public class LamdaEx2 implements hello {
	public static void main(String[] args) {
		
		hello h=()->System.out.println("Gaurav");
		LamdaEx2 lm=new LamdaEx2();
		lm.sayhello();
		h.sayhello();
		
	}

	public void sayhello() {
		System.out.println("Hello..!");
	}

}
