/*
 *  Problem : https://leetcode.com/problems/flipping-an-image/
 *  Date    : 2019-03-18
 *  Dankook UNIV.
 *  Computer Science
 *  Oh Donggeon
 *  
 *  SOLVED!!!
 */

package dan.leetcode.solution;

public class Problem832 {

	public static void main(String[] args) {
		int[][] num1 = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}}; //test case 1
		int[][] num2 = {{1,1,0},{1,0,1},{0,0,0}}; //test case 2
		int[][]	num3 = {{1,1,0},{1,0,0,1}, {1,0,0,0,0,1}}; //wrong value
		int[][] num4 = {{0,1,2},{0,1,0},{0,1,1}}; //wrong value2
		int[][] num5 = {{0,1,1}, {1,0,0}}; //wrong value3
		int[][] num6 = {}; //empty
		
		new Solution832(num1);
		new Solution832(num2);
		new Solution832(num3);
		new Solution832(num4);
		new Solution832(num5);
		new Solution832(num6);
    }
}

class Solution832 {
	public Solution832(int[][] A) {
		flipAndInvertImage(A);
	}
	
    public int[][] flipAndInvertImage(int[][] A) {
        int length = A.length;
        
        if(length == 0) {
        	System.out.println("Empty value");
        	return null;
        }
        
        for(int i = 0; i < length; i++) {
        	if(length != A[i].length) {
        		System.out.println("Wrong VALUE!!!");
        		return null;
        	}
            int end = length - 1;
            for(int j = 0; j < length / 2; j++) {
                int temp = A[i][j];
                A[i][j] = A[i][end];
                A[i][end] = temp;
                end--;
            }
        }
        
        for(int i = 0; i < length; i++) {
        	for(int j = 0; j < length; j++) {
            	if(A[i][j] != 0 && A[i][j] != 1) {
            		System.out.println("Wrong VALUE!!!");
            		return null;
            	}
        		if(A[i][j] == 0) A[i][j] = 1;
        		else A[i][j] = 0;
        	}
        }
        
        for(int i = 0; i < length; i++) {
        	for(int j = 0; j < length; j++) {
        		System.out.print(A[i][j] + " ");
        	}
        	System.out.println();
        }
        
        return A;
    }
}