package array;

import java.util.Arrays;

public class RotateArray {
	  public static void main(String[] args) {
	        int[] numbers = {1, 2, 3, 4, 5 , 6, 7};
	        int k = 3;

	        System.out.println("Original Array: " + Arrays.toString(numbers));
	        rotateArray(numbers, k);
	        System.out.println("Rotated Array by " + k + " positions: " + Arrays.toString(numbers));
	    }

	    public static void rotateArray(int[] nums, int k) {
	        if (nums == null || nums.length == 0 || k % nums.length == 0) {
	            return;
	        }

	        int n = nums.length;
	        k = k % n;

	        reverse(nums, 0, n - 1);
	        reverse(nums, 0, k - 1);
	        reverse(nums, k, n - 1);
	    }

	    private static void reverse(int[] nums, int start, int end) {
	        while (start < end) {
	            int temp = nums[start];
	            nums[start] = nums[end];
	            nums[end] = temp;
	            start++;
	            end--;
	        }
	    }
	}
	

