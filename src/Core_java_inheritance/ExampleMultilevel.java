package Core_java_inheritance;

class Animals{  
void eat(){System.out.println("eating...");}  
}  
class Dogs extends Animals{  
void bark(){System.out.println("barking...");}  
}  
class BabyDog extends Dogs{  
void weep(){System.out.println("weeping...");}  
}  
public class ExampleMultilevel { 
public static void main(String args[]){  
BabyDog d=new BabyDog();  
d.weep();  
d.bark();  
d.eat();  
}}