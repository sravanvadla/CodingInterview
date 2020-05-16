package ArraysandStrings;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class OneAwayString {
	
	private static int min(int findEditDistance, int findEditDistance2, int findEditDistance3) {

		int x = findEditDistance < findEditDistance2 ? findEditDistance : findEditDistance2;
		if( x < findEditDistance3) return x;
		else return findEditDistance3;
	}

	private static int findEditDistance(String s1, String s2, int m, int n) {
		
		if(m == 0 )
			return n;
		if(n == 0)
			return m;
		
		if(s1.charAt(m-1) == s2.charAt(n-1))
			return findEditDistance(s1, s2, m-1, n-1);
		else {
			return 1 + min(findEditDistance(s1, s2, m-1, n),
				findEditDistance(s1, s2, m, n-1),
				findEditDistance(s1, s2, m-1, n-1));
		}
		
	}
	


	public static void main(String[] args) {
		
		String[] s = {"pale", "bake"};
		
		int distance = findEditDistance(s[0], s[1], s[0].length(), s[1].length());
		System.out.println( " distance is " + distance);
		}


}
