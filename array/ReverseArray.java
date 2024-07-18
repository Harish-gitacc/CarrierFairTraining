package array;

public class ReverseArray {	
	public static void main(String[] args) {
        int[] numbers = { 5, 1, 6, 8 ,4, 2, 9, 10};
        int[] reversed = reverseArray(numbers);

        System.out.print("Original array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        
        System.out.println();
        
        System.out.print("Reversed array: ");
        for (int number : reversed) {
            System.out.print(number + " ");
        }
    }

	private static int[] reverseArray(int[] numbers) {
		int[] reversed = new int[numbers.length];
	    for (int i = 0; i < numbers.length; i++) {
	        reversed[i] = numbers[numbers.length - 1 - i];
	    }
	    return reversed;
	}
}


