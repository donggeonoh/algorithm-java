/*
 *  Problem : https://leetcode.com/problems/sort-array-by-parity/
 *  Date    : 2019-03-06
 *  Dankook UNIV.
 *  Computer Science
 *  Oh Donggeon
 *  
 *  SOLVED!!!
 */

package solutions;

public class Problem905 {

	public static void main(String[] args) {
		int[] A = {3,1,2,4};
		
		new Solution905(A);
	}
}

class Solution905 {
	public Solution905(int[] A) {
		sortArrayByParity(A);
	}
	
    public int[] sortArrayByParity(int[] A) {
        
        int mod1, mod2;
        int i, j, temp;
        
        for(i = 0, j = A.length - 1; i < j; j--) {
            mod1 = A[i] % 2;
            mod2 = A[j] % 2;
            
            if(mod1 == 1 && mod2 == 0) {
                temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                i++;
            }
            
            else if(mod1 == 0 && mod2 == 0) {
                i++; j++;
            }
        }
        
        for(int print : A) {
        	System.out.print(print + " ");
        }
        
        return A;
    }
}