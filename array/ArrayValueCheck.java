package array;

public class ArrayValueCheck {
	public static void main(String[] args) {
        int[] numbers = { 1, 6, 8, 4, 2, 9, 5,};
        int valueToFind =2;
        boolean contains = containsValue(numbers, valueToFind);

        System.out.println("Array contains " + valueToFind + ": " + contains);
    }

    public static boolean containsValue(int[] numbers, int value) {
        for (int number : numbers) {
            if (number == value) {
                return true;
            }
        }
        return false;
    }
}
