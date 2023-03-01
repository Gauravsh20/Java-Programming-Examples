package core_java_wrapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestWrapper {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		System.out.println(b);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = bf.read();
		Integer in = Integer.valueOf(a);
		System.out.println(a);
	}

}
