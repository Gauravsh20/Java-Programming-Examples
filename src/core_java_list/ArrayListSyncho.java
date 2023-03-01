package core_java_list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ArrayListSyncho {
	    public static void main(String[] args) {
	        List<Integer> list = new ArrayList<>();
	        List<Integer> synchronizedList = Collections.synchronizedList(list);
	    }
	}
