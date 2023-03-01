package task_core_java;
import java.util.HashMap;
import java.util.Map;
public class WeirdArray {
	public static int findWeirdSubarray(int[] arr) {
        // Count the frequency of each element in the array
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int x : arr) {
            frequency.put(x, frequency.getOrDefault(x, 0) + 1);
        }

        // Find the element with the highest frequency
        int maxFrequency = 0;
        int weirdNumber = 0;
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                weirdNumber = entry.getKey();
            }
        }

        // Return 0 if there is no weird number
        if (maxFrequency <= (arr.length / 2) + 1) {
            return 0;
        }

        // Find the first and last index of the weird number in the array
        int firstIndex = -1;
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == weirdNumber) {
                if (firstIndex == -1) {
                    firstIndex = i;
                }
                lastIndex = i;
            }
        }

        // Return the size of the weird subarray
        return lastIndex - firstIndex + 1;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {3, 3, 1, 3, 3};
        System.out.println(findWeirdSubarray(arr));
    }
	}
