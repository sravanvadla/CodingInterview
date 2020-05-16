package ArraysandStrings;

import java.util.HashMap;

import org.apache.commons.collections4.map.HashedMap;

public class CheckPermutationPallindrome {

	
	private static boolean checkPallindromePermutation(String s1,  String s2) {
		
		HashMap<String, Integer> hash = new HashMap<>();
		
		for(int i=0 ; i < s1.length(); i++) {
			String x = String.valueOf(s1.charAt(i));
			if(hash.get(x) == null) {
				hash.put(x,  1);
			}
			else  {
				int val = hash.get(x);
				hash.put(x, val + 1);
			}
		}
		
		for (int i = 0; i < s2.length(); i++) {
			String x = String.valueOf(s2.charAt(i));
			if(hash.get(x) == null || hash.get(x) == 0)
				return false;
			else {
				int val = hash.get(x);
				hash.put(x, --val);
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		String s1 = "Tact Coa";  
		String[] s = {"taco caat", "atco cta"};
		
		for(int i=0; i< s.length ; i++) {
			boolean result = checkPallindromePermutation(s1.toLowerCase(), s[i]);
			System.out.println( " result for " + s[i] + " is " + result);
		}
	}


}
