package dan.leetcode.solution;

public class Problem807 {

	public static void main(String[] args) {
		int[][] grid1 = {{3,0,8,4},
						 {2,4,5,7},
						 {9,2,6,3},
						 {0,3,1,0}};
		
		int[][] grid2 = {{8,4,8,7},
						 {7,4,7,7},
						 {9,4,8,7},
						 {3,3,3,3}};
		
		new Solution807(grid1);
		new Solution807(grid2);
	}
}

class Solution807 {
	public Solution807(int[][] grid) {
		maxIncreaseKeepingSkyline(grid);
	}
	
    public int maxIncreaseKeepingSkyline(int[][] grid) {
    	int rowLength = grid.length;
    	int colLength = grid[0].length;
    	int[] rowPeak = new int[rowLength];
    	int[] colPeak = new int[colLength];
    	
    	for(int i = 0; i < rowLength; i++) {
    		for(int j = 0; j < colLength; j++) {
    			
    		}
    	}
    	
		return 0;
    }
}