package a.level.Easy;

public class IslandPerimeter {

	public static void main(String[] args) {
		islandPerimeter(new int[][] { { 0, 1, 0, 0 }, { 1, 1, 1, 0 }, { 0, 1, 0, 0 }, { 1, 1, 0, 0 } });
	}

	public static int islandPerimeter(int[][] grid) {
		int counter = 0;
		recursivePerimeter(grid, 0, 0, counter);
		
		return counter;

	}

	static int recursivePerimeter(int[][] grid, int i, int j, int counter) {

		int direction[][] = new int[][] { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 } };

		boolean visited[][] = new boolean[grid.length][grid[0].length];
		for (int[] dir : direction) {
			int x = dir[0];
			int y = dir[1];

			if (isSafe(x + i, y + j, grid) && !visited[x + i][y + j]) {
				int move_x = x + i;
				int move_y = y + j;
				visited[move_x][move_y] = true;
				recursivePerimeter(grid, move_x, move_y, counter);
			} else if (grid[i][j] == 1) {
				counter += 1;
			}
		}
		System.out.println(counter);
		return counter;
	}

	private static boolean isSafe(int i, int j, int[][] grid) {
		return (i > 0 && i < grid.length && j > 0 && j < grid[0].length && grid[i][j] == 1);
	}

}
