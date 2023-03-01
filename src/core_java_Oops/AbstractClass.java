package core_java_Oops;

abstract class Vehicles{
	public abstract int getNoofWheels();
}

class Bus extends Vehicles{
	public int getNoofWheels() {
		return 6;
	}
	}
class Auto extends Vehicles{
	public int getNoofWheels() {
		return 3;
	}
}



public class AbstractClass {
	public static void main(String[] args) {
		Bus bus=new Bus();
		Auto auto=new Auto();
		System.out.println("Bus No of wheels="+bus.getNoofWheels());
		System.out.println("Auto No of wheels="+auto.getNoofWheels());
	}

}
