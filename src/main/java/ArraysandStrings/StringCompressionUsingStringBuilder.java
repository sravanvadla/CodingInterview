package ArraysandStrings;

public class StringCompressionUsingStringBuilder {
	
	
	private static String compressString(String str, int length) {

		StringBuilder sb = new StringBuilder();
		int count=0;
		for(int i=0 ; i<length ; i++) {
			if(  i == (length-1) || str.charAt(i) != str.charAt(i+1) ) {
				sb.append(str.charAt(i)).append(++count);
				count = 0;
			} 
			else {
				count++;
			}
		}
		
		return sb.toString();
		
	}
	
	
	public static void main(String[] args) {
		
		String str = "aabcccaaa";
		
		System.out.println( " compressed string is " + compressString(str, str.length()));
	}



}
