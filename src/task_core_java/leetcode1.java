package task_core_java;

import java.util.ArrayList;
import java.util.Iterator;

public class leetcode1 {
	public int[] twoSum(int[] nums, int target) {
		int[] res = new int[2];
		for(int i=0;i<nums.length;i++) {
			for (int j = 0+1; j < nums.length; j++) {
				
				if (nums[i]+nums[j]==target) {
					res[0]=nums[j];
					res[1]=nums[i];
					
				}
			}
		}
		
		
		return res;
	}
	public static void main(String[] args) {
		int [] num= {2,7,11,15};
		int target=9;
		leetcode1 ls=new leetcode1();
		System.out.println(ls.twoSum(num, target));
		
		
	}

}
