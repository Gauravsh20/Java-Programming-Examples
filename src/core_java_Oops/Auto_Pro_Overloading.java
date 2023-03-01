package core_java_Oops;

class AutoPro{
	 public void m1() {
		 System.out.println("No-agru....");
		 
	 }
	 public void m1(int a) {
		 System.out.println("Integer type agru....");
	 }
	public void m1(float b ) {
		System.out.println("Float type agru....");
	}
}
public class Auto_Pro_Overloading {
	public static void main(String[] args) {
		AutoPro auto=new AutoPro();
		auto.m1();
		auto.m1(1);
		auto.m1(10.3f);
		auto.m1(10L);//Long type Argument but follow the automatic promotion
		/* auto.m1(10.4); *///complie time error show bcz 
						//not method and no follow the the automatic promotion
		
	}
}
