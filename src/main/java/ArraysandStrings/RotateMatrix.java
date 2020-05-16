package ArraysandStrings;

// Think layer by layer
//Rotating a layer is just mean swapping the values in four arrays. If you can swap two array values, just extend it to four arrays

public class RotateMatrix {

	public static boolean rotate(int[][] matrix) {
		if (matrix.length == 0 || matrix.length != matrix[0].length) return false; // Not a square
		int n = matrix.length;
		
		for (int layer = 0; layer < n / 2; layer++) {
			int first = layer;
			int last = n - 1 - layer;
			for(int i = first; i < last; i++) {
				int offset = i - first;
				int top = matrix[first][i]; // save top

				// left -> top
				matrix[first][i] = matrix[last-offset][first]; 			

				// bottom -> left
				matrix[last-offset][first] = matrix[last][last - offset]; 

				// right -> bottom
				matrix[last][last - offset] = matrix[i][last]; 

				// top -> right
				matrix[i][last] = top; // right <- saved top
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[][] m =new int[3][3];
		int sum=1;
		for(int i=0 ; i < 3 ; i++) {
			for(int j=0 ; j<3 ; j++) {
				m[i][j] = sum++;
			}
		}
		rotate(m);
		System.out.println(m);
	}

}


