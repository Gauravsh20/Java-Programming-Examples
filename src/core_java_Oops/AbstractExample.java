package core_java_Oops;

abstract class Shape {
	String color;
	abstract double area();
	public abstract String toString(); 
	
	public Shape(String color) {
		this.color=color;
		
	}
	public String getclor() {
		return color;
	}
}
class Circle extends Shape{
	double radius;
	public Circle(String color,double radius) {
		super(color);
		System.out.println("Radius of circle");
		this.radius=radius;
	}
	@Override
	double area() {
		return Math.PI * Math.pow(radius, 2);

	}
	@Override
	public String toString() {
		 return "Circle color is " + super.getclor()
         + "and area is : " + area();
	}
	
}
class Rectangle extends Shape{
	double length;
	double width;
	public Rectangle(double length,double width,String color){
		
		super(color);
		this.length=length;
		this.width=width;
		
	}
	@Override
	double area() {
		
		return (length*width);
	}
	@Override
	public String toString() {
		
		return "Rectangle color is"+ super.getclor()+" area is"+ area();
	}
}



public class AbstractExample {
	public static void main(String[] args) {
		Shape s1=new Rectangle(12, 13," pink");
		Shape s2=new Circle("blue",12 );
		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}
	

}
