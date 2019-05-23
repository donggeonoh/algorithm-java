/*
 *  Problem : https://leetcode.com/problems/squares-of-a-sorted-array/
 *  Date    : 2019-03-06
 *  Dankook UNIV.
 *  Computer Science
 *  Oh Donggeon
 *  
 *  SOLVED!!!
 */

package dan.leetcode.algorithms;

import java.util.Arrays;

public class Problem977 {

	public static void main(String[] args) {
		int[] A = {-4,-1,0,3,10};
		int[] B = {0,1,2,3,4};
		
		new Solution977(A);
		new Solution977(B);
	}
}

class Solution977 {
	public Solution977(int[] A) {
		sortedSquares(A);
	}
	
    public int[] sortedSquares(int[] A) {
        
        int arrLength = A.length;
        int i;
        
        for(i = 0; i < arrLength; i++) {  // ¹è¿­ Á¦°ö
            A[i] = (int) Math.pow(A[i], 2);
        }
        
        Arrays.sort(A);
        
        for(int print : A)
        	System.out.print(print + " ");
        
        System.out.println();
        
        return A;
    }
}