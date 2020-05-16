package ArraysandStrings;

public class CheckPermutationUsingBitwise {
	
	private static boolean checkPermutation(String s1, String s2) {

		if(s1.length() != s2.length())
			return false;
		else  {
			int checker1 = 0, checker2 = 0;
			for (int i = 0; i < s1.length(); i++) {
				int val = s1.charAt(i) - 'a';
				checker1 |= (1 << val);
			}
			
			for (int i = 0; i < s2.length(); i++) {
				int val = s2.charAt(i) - 'a';
				checker2 |= (1 << val);
			}
			
			if(checker1 == checker2)
				return true;
			else return false;
		}
		
	}

	public static void main(String[] args) {
		
		String s1 = "abc";
		String s2 = "cab";
		boolean result = checkPermutation(s1, s2);
		System.out.println( " Is permutation : " + result);
	}


}
