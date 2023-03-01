package collectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ExampleQuestion {   
	public static void main(String[] args) {
		int[] arr=new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=i;
		}
		  
		System.out.println("Array before conversion: "+ Arrays.toString(arr));   
		List<Integer> list = ArrayToListConversion(arr);  
		list.add(12);
		list.add(12);
		list.add(12);
		List<Integer> newlist = RemoveDuplicates(arr); 
		System.out.println("Array as List: " + list);
		System.out.println("List not duplicates: " + newlist);
		Set<Integer> set = new HashSet<>(list);
		set.addAll(newlist);
		Set<Integer> newset=Squareeven(set);
		System.out.println("Sets :"+set.toString());
		System.out.println("Sets :"+newset.toString());
		}
	private static Set<Integer> Squareeven(Set<Integer> set) {
		Set<Integer>st=new TreeSet<>();
	for (Integer integer : set) {
		if(integer%2==0) {
			st.add(integer*integer);
		}
		st.add(integer);
	}
		
		return st;
	}
	@SuppressWarnings("unchecked")
	private static <T> List<Integer> RemoveDuplicates(int[] arr) {
	
		List<T> list = new ArrayList<>();    
		for (Integer t : arr)   
		{   
		if(!list.contains(t)) {
			list.add((T) t);
		}
	  
		}   
		return (List<Integer>) list;

	}
	
	
	@SuppressWarnings("unchecked")
	private static <T> List<Integer> ArrayToListConversion(int[] array) { 
		List<T> list = new ArrayList<>();   
		for (Integer t : array)   
		{   
		list.add((T) t);   
		}     
		return (List<Integer>) list;   
	}       
	
	
	
	

}
