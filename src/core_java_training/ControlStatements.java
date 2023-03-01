package core_java_training;

public class ControlStatements {
	public static void main(String[] args) {
		boolean a=true;
		bl1:{
			bl2:{
				bl3:{
					System.out.println("Block -3");
					if(a) break bl2;
					}
				System.out.println("Block -2");
				}
			System.out.println("Block -1");
			}
		System.out.println("Block All");
		}
		
	}


