
public class binaryMatrix {
	
	public static boolean search(int[][] matrix, int key) {
		int pos = 0;
		if (matrix.length % 2 == 0) {
			pos = matrix.length / 2;
		} else {
			pos = matrix.length / 2 + 1;
		}
		int low = 0, high = matrix.length - 1;
		
		while (low <= high && pos >= 0 && pos < matrix.length) {
			if (matrix[pos][0] > key) {
				high = pos - 1;
			} else if (matrix[pos][0] < key && matrix[pos][matrix[pos].length - 1] < key) {
				low = pos + 1;
			} else {
				break;
			}
			pos = (low + high) / 2;
		}
		low = 0; high = matrix[pos].length - 1;
		int colInd = (high + low) / 2;
		
		while (low <= high && matrix[pos][colInd] != key) {
			if (matrix[pos][colInd] > key) {
				high = colInd - 1;
			} else {
				low = colInd + 1;
			}
			colInd = (low + high) / 2;
		}
		if (low > high) {
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[][] arr = {{2,4,5,6},{9,12,20,31},{46,52,57,59},{62,70,80,90}};
		System.out.println(search(arr, 13));
	}

}
