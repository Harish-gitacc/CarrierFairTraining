package stringPractice;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Harish";
		String result="";
		for(int i =str.length()-1;i>=0;i--)
		{
			result=result+str.charAt(i);
		}
		System.out.println("revirse string :" +result);
	}

}
