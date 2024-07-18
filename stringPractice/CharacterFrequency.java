package stringPractice;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "elephant";
	        Map<Character, Integer> frequencyMap = countCharacterFrequency(str);

	        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	    }

	    public static Map<Character, Integer> countCharacterFrequency(String str) {
	        Map<Character, Integer> frequencyMap = new HashMap<>();

	        for (char c : str.toCharArray()) {
	            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
	        }

	        return frequencyMap;
	    }
	}


