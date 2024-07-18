package stringPractice;

import java.util.Scanner;

public class RemoveWhitespaces {

	public static void main(String[] args) {
	/*	// TODO Auto-generated method stub
		System.out.println("Enter the string :");
     Scanner sc = new Scanner(System.in);
     String input = sc.nextLine();
     
     System.out.println("Original String :"+input);
     input=input.replace("\\s", "");
     System.out.println("Output String : "+input);
     */
		String str = "this is sample string";
        String result = removeWhitespaces(str);
        System.out.println("Original string: " + str);
        System.out.println("String without whitespaces: " + result);
    }

    public static String removeWhitespaces(String str) {
        return str.replaceAll("\\s", "");
    }

}
