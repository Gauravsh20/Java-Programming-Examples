package core_java_Oops;

class Studentss{
	
	
	String name;
	int age;
	int rollno;
	Studentss(String name,int age, int rollno){
		/*
		 * name=name; age=age; rollno=rollno;
		 */
		this.name=name;
		this.age=age;
		this.rollno=rollno;
		}
	
	
	public String toString() {
		return "Student1 [name=" + name + ", age=" + age + ", rollno=" + rollno + "]";
	}
	
	
}
public class ThisKeywordExample {
	public static void main(String[] args) {
		Studentss sts= new Studentss("Gaurav", 23, 100011);
		System.out.println(sts.toString());
		System.out.println(sts.name);
	}
	

}
