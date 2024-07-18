package array;

public class SumOfArray {

	public static void main(String[] args) {
		
	        int[] numbers = {4, 2, 9, 5, 1, 6, 8, 10};
	        int sum = calculateSum(numbers);

	        System.out.println("Sum of array elements: " + sum);
	    }

	    public static int calculateSum(int[] numbers) {
	        int sum = 0;
	        for (int number : numbers) {
	            sum += number;
	        }
	        return sum;
	    }
	

	}


