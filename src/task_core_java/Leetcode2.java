package task_core_java;
class checlpd{
	public boolean pd(int x) {
		 if(x<0)return false;
		    int temp=x;
		    int sum=0;
		    while(x!=0){
		    sum=(sum*10)+(x%10);
		    x=x/10;
		    }
		    return (temp==sum);
		    }
		}

public class Leetcode2 {
	public static void main(String[] args) {
		int num=0;
		checlpd cd=new checlpd();
		System.out.println(cd.pd(num));
		
	}

}
