/*
 *  Problem : https://leetcode.com/problems/jewels-and-stones/
 *  Date    : 2019-03-03
 *  Dankook UNIV.
 *  Computer Science
 *  Oh Donggeon
 *  
 *  SOLVED!!!
 */

package dan.leetcode.algorithms;

public class Problem771 {

	public static void main(String[] args) {
		new Solution771("abc", "aBcAbcabC");
	}
}

class Solution771 {
	public Solution771(String J, String S) {
		numJewelsInStones(J, S);
	}
    int numJewelsInStones(String J, String S) {
    	int jLen = J.length();
    	int sLen = S.length();
    	
    	int jNum = 0;
    	
    	for(int i = 0; i < jLen; i++)
    		for(int j = 0; j < sLen; j++)
    			if(J.charAt(i) == S.charAt(j)) jNum++;
    	
    	System.out.println(jNum);
    	
		return jNum;
    }
}

/* C Language

int numJewelsInStones(char* J, char* S) {

	int Jlen = strlen(J);
	int Slen = strlen(S);

	int Jnum = 0;

	for(int i = 0; i < Jlen; i++) {
    	for(int j = 0; j < Slen; j++) {
        	if(J[i] == S[j]) {
            	Jnum++;
        	}
    	}
	}

	return Jnum;
}
*/