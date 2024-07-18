package array;

public class FindIndexArray {
	public static void main(String[] args) {
        int[] numbers = { 1, 6, 8, 4, 2, 9, 5, 7};
        int valueToFind = 6;
        int index = findIndex(numbers, valueToFind);

        if (index != -1) {
            System.out.println("Value " + valueToFind + " found at index: " + index);
        } else {
            System.out.println("Value " + valueToFind + " not found in the array.");
        }
    }

    public static int findIndex(int[] numbers, int value) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == value) {
                return i;
            }
        }
        return -1;
    }
}

