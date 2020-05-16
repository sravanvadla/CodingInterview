package ArraysandStrings;

public class ZeroMatrix {

	
	private static void makeZero(int[][] m, int l, int b) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {

		int[][] m =new int[3][3];
		int sum=1;
		for(int i=0 ; i < 3 ; i++) {
			for(int j=0 ; j<3 ; j++) {
				m[i][j] = sum++;
			}
		}
		makeZero(m, 3, 3);
		System.out.println(m);
	    
	}


}
