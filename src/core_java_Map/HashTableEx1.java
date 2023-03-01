package core_java_Map;

import java.util.Hashtable;

class Temp{
	int i;
	public Temp( int i) {
		this.i=i;
	}
	@Override
	public int hashCode() {
		return i;
	}
	@Override
	public String toString() {
		return i+"";
	}
	@Override
	public boolean equals(Object obj) {
		Object ob1=new Object();
		return true;
	}
}

public class HashTableEx1 {
	public static void main(String[] args) {
		Hashtable ht=new Hashtable<>();
		
		ht.put(new Temp(2),"A");
		ht.put(new Temp(5),"B");
		ht.put(new Temp(7),"C");
		ht.put(new Temp(9),"D");
		ht.put(new Temp(10),"E");
		ht.put(new Temp(20),"F");
		ht.put(new Temp(23),"G");
		ht.put(new Temp(27),"K");
		System.out.println(ht);//[10=E,20=F,9=D,7=C,27=K,5=B,2=A,23=G]
		
	}

}
