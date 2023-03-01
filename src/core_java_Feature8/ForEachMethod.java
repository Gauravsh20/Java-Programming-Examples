package core_java_Feature8;

import java.util.Arrays;
import java.util.List;

public class ForEachMethod {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("foo", "bar", "baz");
		list.forEach(str -> System.out.println(str));
	}

}
