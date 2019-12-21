/*
 *  Problem : https://leetcode.com/problems/robot-return-to-origin/
 *  Date    : 2019-03-11
 *  Dankook UNIV.
 *  Computer Science
 *  Oh Donggeon
 *  
 *  SOLVED!!!
 */

package dan.leetcode.solution;

public class Problem657 {

	public static void main(String[] args) {
		new Solution657("UDUD");
		new Solution657("LRDD");
		new Solution657("");
	}
}

class Solution657 {
	public Solution657(String str) {
		judgeCircle(str);
	}
	
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        int i;
        
        for(i = 0; i < moves.length(); i++) {
            if(moves.charAt(i) == 'U')
                y++;
            else if(moves.charAt(i) == 'D')
                y--;
            else if(moves.charAt(i) == 'L')
                x--;
            else if(moves.charAt(i) == 'R')
                x++;
        }
        
        if(x == 0 && y == 0) {
        	System.out.println("Return");
            return true;
        }
        else {
        	System.out.println("Not return");
            return false;
        }
    }
}