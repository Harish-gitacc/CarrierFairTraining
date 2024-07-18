package array;

import java.util.Arrays;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] array = {1, 2, 2, 3, 4, 4, 5, 5, 6 ,7};
		int[] result = removeDuplicates(array);
		System.out.println(Arrays.toString(result)); 
	}

	public static int[] removeDuplicates(int[] array) {
		return Arrays.stream(array).distinct().toArray();

	}
}
