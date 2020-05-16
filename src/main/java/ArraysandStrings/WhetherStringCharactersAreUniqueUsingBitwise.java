package ArraysandStrings;

public class WhetherStringCharactersAreUniqueUsingBitwise {
	
	public static boolean isUniqueChars(String str) {
	
		if(str.length() > 26) {
			return false;
		}
		else  {
			int checker = 0 ;
			for(int i=0; i < str.length() ; i++) {
				int val = str.charAt(i) - 'a';
				if((checker & (1 << val)) > 0 ) return false;
				checker |= (1 << val);
			}
			return true;
		}
	}
	
	public static void main(String[] args) {
		String[] words = {"abcde"};
		for (String word : words) {
			System.out.println(word + ": " + isUniqueChars(word));
		}
	}

}

