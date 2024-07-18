package array;

import java.util.TreeSet;

public class SecondLargest {
	  public static void main(String[] args) {
	int[] array = { 3, 1, 4, 2, 5, 9, 6, 8 , 10, 12};
	int secondLargest = secondLargest(array);
	 System.out.println(secondLargest);

	  }
public static int secondLargest(int[] array) {
	TreeSet<Integer> set = new TreeSet<>();
    for (int num : array) {
        set.add(num);
    }
    set.remove(set.last());
    return set.last();
}

}


