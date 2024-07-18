package stringPractice;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        String str = "Philadelphia"; 
		        String uniqueStr = removeDuplicates(str);
		        System.out.println("String without duplicates:"+uniqueStr);
		    }

		    public static String removeDuplicates(String str) {
		        StringBuilder uniqueStr = new StringBuilder();
		        for (int i=0;i<str.length();i++) {
		            char c=str.charAt(i);
		            if(uniqueStr.indexOf(String.valueOf(c)) == -1) {
		                uniqueStr.append(c);
		            }
		        }
		        return uniqueStr.toString();
		    }	
	}


