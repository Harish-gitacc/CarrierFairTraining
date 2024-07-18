package array;

public class MaxAndMini {

	
		public static void main(String[] args) {
	        int[] numbers = { 5, 1, 6, 8, 4, 2, 9,};
	        int[] minMax = findMinMax(numbers);

	        System.out.println("Minimum element: " + minMax[0]);
	        System.out.println("Maximum element: " + minMax[1]);
	    }

	    public static int[] findMinMax(int[] numbers) {
	        int min = Integer.MAX_VALUE;
	        int max = Integer.MIN_VALUE;

	        for (int number : numbers) {
	            if (number < min) {
	                min = number;
	            }
	            if (number > max) {
	                max = number;
	            }
	        }
	        return new int[]{min, max};
	    }

	}


