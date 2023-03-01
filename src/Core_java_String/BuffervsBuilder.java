package Core_java_String;

public class BuffervsBuilder {
	public static void main(String[] args) {
		long starttime=System.currentTimeMillis();
		StringBuffer sf=new StringBuffer("Radhe");
		for(int i=0;i<1000;i++)
		{
		sf.append("shayam");
		}
		System.out.println(starttime);
		System.out.println("StringBuffer time="+(System.currentTimeMillis()-starttime)+"ms");
		starttime=System.currentTimeMillis();
		StringBuilder sb=new StringBuilder("Sita");
		for(int i=0;i<1000;i++)
		{
		sb.append("Ram");
		}
		System.out.println(starttime);
		System.out.println("StringBuffer time="+(System.currentTimeMillis()-starttime)+"ms");
	}
	

}
