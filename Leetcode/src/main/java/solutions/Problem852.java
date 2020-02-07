/*
 *  Problem : https://leetcode.com/problems/peak-index-in-a-mountain-array/
 *  Date    : 2019-03-21
 *  Dankook UNIV.
 *  Computer Science
 *  Oh Donggeon
 *  
 *  SOLVED!!!
 */

package solutions;

public class Problem852 {

	public static void main(String[] args) {
		int[] A = {0,1,2,3,4,3,2,1,1};
		new Solution852(A);
	}
}

class Solution852 {
	public Solution852(int[] A) {
		peakIndexInMountainArray(A);
	}
	
    public int peakIndexInMountainArray(int[] A) {
    	int length = A.length;
    	int peak, peakIndex, val;
    	int climb = 1;
    	
    	if(length == 0) return -1;
    	
    	peak = A[0];
    	peakIndex = 0;
    	
    	for(climb = 1; climb < length; climb++) {
    		if(peak < A[climb]) {
    			peak = A[climb];
    			peakIndex = climb;
    		}
    		else break;
    	}
    	
    	if(climb >= length - 1) {
    		System.out.println("peak : " + peak + " peak index : " + peakIndex);
    		return peakIndex;
    	}
    	
    	for(val = peak; climb < length; climb++) {
    		if(val > A[climb]) val = A[climb];
    		else break;
    	}
    	
    	if(climb == length) {
    		System.out.println("Peak : " + peak + " peak index : " + peakIndex);
    		return peakIndex;
    	}
    	
    	else {
    		System.out.println("Not mountain!!!");
    		return -1;
    	}
    }
}
