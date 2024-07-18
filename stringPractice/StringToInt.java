package stringPractice;

import java.util.Scanner;

public class StringToInt {     
		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a string of digits: ");
	        String input = scanner.nextLine();

	        try {
	            int result = Integer.parseInt(input);
	            System.out.println("The integer value is: " + result);
	        } catch (NumberFormatException e) {
	            System.out.println("Invalid input! Please enter a valid string of digits.");
	        }

	    }
	
	}


