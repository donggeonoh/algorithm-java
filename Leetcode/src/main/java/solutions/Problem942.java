/*
 *  Problem : https://leetcode.com/problems/di-string-match/
 *  Date    : 2019-03-18
 *  Dankook UNIV.
 *  Computer Science
 *  Oh Donggeon
 *  
 *  SOLVED!!!
 */

package solutions;

public class Problem942 {

	public static void main(String[] args) {
		new Solution942("IIID");
		new Solution942("DDDDI");
	}

}

class Solution942 {
	public Solution942(String S) {
		diStringMatch(S);
	}
	
    public int[] diStringMatch(String S) {
        int[] result = new int[S.length() + 1];
        int inc = 0;
        int dec = S.length();
        
        if(S.length() == 0) return null;
        
        for(int i = 0; i < S.length(); i++) {
            if(S.charAt(i) == 'I') {
                result[i] = inc;
                inc++;
            } else if(S.charAt(i) == 'D') {
                result[i] = dec;
                dec--;
            } else {
                System.out.println("WRONG WORDS!!!");
                return null;
            }
        }
        
        if(S.charAt(S.length() - 1) == 'I')
            result[S.length()] = result[S.length() - 1] + 1;
        else
            result[S.length()] = result[S.length() - 1] - 1;
        
        for(int print : result)
        	System.out.print(print + " ");
        
        System.out.println();
        
        return result;
    }
}