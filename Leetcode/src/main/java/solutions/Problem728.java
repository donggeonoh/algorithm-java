/*
 *  Problem : https://leetcode.com/problems/self-dividing-numbers/
 *  Date    : 2019-03-21
 *  Dankook UNIV.
 *  Computer Science
 *  Oh Donggeon
 *  
 *  SOLVED!!!
 */

package solutions;

import java.util.ArrayList;
import java.util.List;

public class Problem728 {

	public static void main(String[] args) {
		
		new Solution728().selfDividingNumbers(1, 40);
	}
}

class Solution728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
    	if(left <= 0) {
    		System.out.println("Please input more than zero.");
    		return null;
    	}
    	else if (left > right) {
    		System.out.println("Please input right value more than left value.");
    		return null;
    	}
    	
    	List<Integer> result = new ArrayList<Integer>();
    	int pos, value;
    	int i, j;
    	
    	for(i = left; i <= right; i++) {
    		value = i;
            for(j = i; j != 0; j /= 10) {
            	pos = j % 10;
            	if(pos == 0) break;
            	else if(value % pos != 0) break;
            }
            
            if(j == 0)
            	result.add(i);
        }
    	
    	System.out.println(result.toString());
    	
		return result;
    }
}