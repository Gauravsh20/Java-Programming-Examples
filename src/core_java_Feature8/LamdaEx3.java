package core_java_Feature8;

import java.util.function.Function;

public class LamdaEx3 {
	public static void main(String[] args) {
		Function<Integer, Integer> square = n -> n * n;
		int result = square.apply(5); // returns 25
		System.out.println(result);
	}

}
