package core_java_training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BufferReaderClass{
	//instance Variable 
	String name;
	int rollno;
	
	//method
	public void fun(String name,int rollno) {
		this.name=name;
		this.rollno=rollno;
		System.out.println("Name "+name+ " Roll no -"+rollno);
		
	}
	
	
	
}
public class BufferReader {

	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		String name=bf.readLine();
		int rollno=Integer.parseInt(bf.readLine());
		BufferReaderClass bfc=new BufferReaderClass();
		bfc.fun(name, rollno);
	}

}
