/*
 *  Problem : https://leetcode.com/problems/unique-email-addresses/
 *  Date    : 2019-03-22
 *  Dankook UNIV.
 *  Computer Science
 *  Oh Donggeon
 *  
 *  SOLVED!!!
 */

package dan.leetcode.solution;

import java.util.ArrayList;

public class Problem929 {

	public static void main(String[] args) {
		String[] str = {"test.email+alex@leetcode.com",
						"test.e.mail+bob.cathy@leetcode.com",
						"testemail+david@lee.tcode.com"};
		
		new Solution929(str);
	}
}

class Solution929 {
	public Solution929(String[] emails) {
		numUniqueEmails(emails);
	}
    public int numUniqueEmails(String[] emails) {
    	ArrayList<String> result = new ArrayList<String>();
    	int length = emails.length;
    	
    	if(length == 0) return -1;
    	
    	for(int i = 0; i < length; i++) {
    		int emailsLength = emails[i].length();
    		int indexOfAt = emails[i].indexOf('@');
    		int k, size = result.size();
    		
    		if(indexOfAt == -1) {
    			System.out.println("Wrong Emails!!!");
    			return -1;
    		}
    		
    		for(int j = 0; j < indexOfAt; j++) {
    			if(emails[i].charAt(j) == '.') {
    				if(j == 0) emails[i] = emails[i].substring(j + 1);
    				else if(j == emailsLength - 1) emails[i] = emails[i].substring(j - 1);
    				else emails[i] = emails[i].substring(0, j) + emails[i].substring(j + 1);
    				indexOfAt--;
    			} else if(emails[i].charAt(j) == '+') {
    				emails[i] = emails[i].substring(0, j) + emails[i].substring(indexOfAt);
    				break;
    			}
    		}
    		
    		for(k = 0; k < size; k++)
        		if(emails[i].equals(result.get(k))) break;
    		
    		if(k == size) result.add(emails[i]);
    	}
    	
    	for(String str : result) {
        	System.out.println("emails : " + str);	
    	}
    	
		return result.size();
    }
}