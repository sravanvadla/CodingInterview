package ArraysandStrings;

public class WhetherStringCharactersAreUnique {

	

	private static String isUniqueChars(String word) {
		int size = word.length();
		int ascii = word.indexOf(1);
		boolean[] a = new boolean[26];
		for (int i = 0; i < word.length(); i++) {
			int diff = word.charAt(i) - 'a';
			a[diff] = true;
		}
		System.out.println( a.length);
		return null;
	}
	
	public static void main(String[] args) {
		
		String[] words = {"abcde"};
		for (String word : words) {
			System.out.println(word + ": " + isUniqueChars(word));
		}
	}

	
}
