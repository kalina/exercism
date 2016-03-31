import java.util.Arrays;

public class PascalsTriangle {

	public static int[][] computeTriangle(int rows) throws IllegalArgumentException{

		if(rows <0 ){ 
			throw new IllegalArgumentException();
		}

		int [][] tri = new int[rows][];

		for (int r=0; r<tri.length; r++) {
			tri[r] = new int[r+1];
			tri[r][0] = 1;
			tri[r][r] = 1;
			for (int c=1; c<r; c++) {
				tri[r][c] = tri[r-1][c]+tri[r-1][c-1];
			}
		}

		return tri;
	}

	public static boolean isTriangle(int[][] input){
		int i = input.length;
		System.out.println(i);
		return Arrays.deepEquals(input, computeTriangle(input.length));
	}
}
