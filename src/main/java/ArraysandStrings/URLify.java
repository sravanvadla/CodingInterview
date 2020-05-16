package ArraysandStrings;

public class URLify {

	
	private static void URLifyString(char[] str, int trueLength) {
		
		int spaceCount=0;
		for(int i=0; i < trueLength ; i++) 
			if(str[i] == ' ')
				spaceCount++;
		System.out.println( " spaces count " + spaceCount);
		int index = trueLength + 2*spaceCount;
		for(int i=trueLength; i>0 ; i-- ) {
			if(str[i] != ' ') {
				str[index-1] = str[trueLength-1];
			} else {
				str[index-1] = '0';
				str[index-2] = '2';
				str[index-3] = '%';
				index = index-3;
			}
		}
	}
	
	private static int findTrueLength(char[] str) {
		for(int i = str.length ; i >0 ; i--) {
			if(str[i] != ' ')
				return i;
		}
		return 0;
	}

	
	public static void main(String[] args) {
		
		String str = "Mr John Smith   ";
		System.out.println(str.length());
		int trueLength = findTrueLength(str.toCharArray());
		URLifyString(str.toCharArray(), trueLength);
	}



}
