package core_java_training;

class CloneMthd implements Cloneable {
	String name;
	int rollno;
	//parameterized constructor 
	CloneMthd(String name,int rollon){
		this.name=name;
		this.rollno=rollon;
	}
	public String toString() {
		return "name " + name +" roll no " +rollno;
		
	}
	public CloneMthd clone() throws CloneNotSupportedException {
		return (CloneMthd)super.clone();
	}
	
	
}


public class ObjectCloneMethod {
	public static void main(String[] args) throws CloneNotSupportedException {
		CloneMthd obj1=new CloneMthd("Gaurav", 12);
		System.out.println(obj1);
		System.out.println(obj1.hashCode());
		CloneMthd obj2=obj1.clone();
		obj2.name="raju";
		System.out.println(obj2);
		System.out.println(obj2.hashCode());
		
	}
	
	

}
