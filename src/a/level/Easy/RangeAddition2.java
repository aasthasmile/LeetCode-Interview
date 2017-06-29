/**
 * 
 */
package a.level.Easy;

/**
 * @author Aastha Jain
 *
 */
public class RangeAddition2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		maxCount(2, 2, new int[][] { { 2, 2 }, { 3, 3 } });

		maxCount(4, 5, new int[][] {});

	}

	/**
	 * In order to calculate number of times maximum integer occurs would be to
	 * find the upper left corner and below right corner at which all values are
	 * being incremented due to several update operations.
	 * 
	 * @param m
	 *            Eg - m=4 and n=5 i.e. we have 4*5 matrix
	 *            ops[][]={[2,3][3,3],[4,3],[2,2],[3,2]}
	 * @param ops
	 *            When we construct the matrix ,we will find the upper left
	 *            corner is always (1,1)(i.e. (0,0) in terms of matrix .The
	 *            reason would be first index will always be incremented) and we
	 *            have find below right corner.After careful consideration and
	 *            example, I came to conclusion that right corner will be
	 *            minimum(column1-values,column2 -values). Try with diff update
	 *            operations.
	 */
	public static int maxCount(int m, int n, int[][] ops) {

		if (ops.length == 0)
			return m*n;

		int col1 = Integer.MAX_VALUE, col2 = Integer.MAX_VALUE;
		for (int[] operation : ops) {

			col1 = Math.min(col1, operation[0]); // minimum of the first column
			col2 = Math.min(col2, operation[1]); // minimum of the second column
		}

		/** col1*col2 will be maximum number of blocks with maximum value */
		return col1 * col2;

	}

}
