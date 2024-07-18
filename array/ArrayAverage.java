package array;

public class ArrayAverage {

	public static void main(String[] args) {
		 int[] numbers = { 1, 6, 8, 4, 2, 9, 5,};
	        double average = calculateAverage(numbers);

	        System.out.println("Average of array elements: " + average);
	    }

	    public static double calculateAverage(int[] numbers) {
	        int sum = 0;
	        for (int number : numbers) {
	            sum += number;
	        }
	        return (double) sum / numbers.length;
	    }

	}


