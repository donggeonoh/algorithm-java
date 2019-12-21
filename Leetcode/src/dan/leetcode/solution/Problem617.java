/*
 *  Problem : https://leetcode.com/problems/merge-two-binary-trees/
 *  Date    : 2019-03-11
 *  Dankook UNIV.
 *  Computer Science
 *  Oh Donggeon
 *  
 *  SOLVED!!!
 */

package dan.leetcode.solution;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem617 {

	public static void main(String[] args) {
		new Solution617();
	}
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution617 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        
        if(t1 == null && t2 == null)
            return null;
        
        else if(t1 != null && t2 == null)
            return t1;
        
        else if(t1 == null && t2 != null)
            return t2;
        
        TreeNode mergeNode = new TreeNode(0);
        
        merge(mergeNode, t1, t2);
        
        return mergeNode;
    }
    
    public TreeNode merge(TreeNode mergeNode, TreeNode t1, TreeNode t2) {
     
        if(t1 == null && t2 == null)
            return null;
        
        mergeNode.val = t1.val + t2.val;
        
        if(t1.left != null || t2.left != null) {
            if(t1.left != null && t2.left != null) {
                mergeNode.left = new TreeNode(0);
                merge(mergeNode.left, t1.left, t2.left);
            }
            
            if(t1.left == null) {
                mergeNode.left = new TreeNode(0);
                merge(mergeNode.left, t2.left);
            }
            
            if(t2.left == null) {
                mergeNode.left = new TreeNode(0);
                merge(mergeNode.left, t1.left);
            }
        }
        
        
        if(t1.right != null || t2.right != null) {
            if(t1.right != null && t2.right != null) {
                mergeNode.right = new TreeNode(0);
                merge(mergeNode.right, t1.right, t2.right);
            }
            
            if(t1.right == null) {
                mergeNode.right = new TreeNode(0);
                merge(mergeNode.right, t2.right);
            }
            
            if(t2.right == null) {
                mergeNode.right = new TreeNode(0);
                merge(mergeNode.right, t1.right);
            }
        }
        
        return mergeNode;
    }
    
    public void merge(TreeNode mergeNode, TreeNode t) {
        
        mergeNode.val = t.val;
        
        if(t.left != null) {
            mergeNode.left = new TreeNode(0);
            merge(mergeNode.left, t.left);
        }
        
        if(t.right != null) {
            mergeNode.right = new TreeNode(0);
            merge(mergeNode.right, t.right);
        }
    }
}

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};

        if(strings == null || n < 1) {
            return null;
        }

        int length = strings.length;

        for(int i = 0; i < length; i++) {
            for(int j = i + 1; j < length; j++) {
                if(strings[i].charAt(n) > strings[j].charAt(n)) {
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
            }
        }

        answer = strings;

        return answer;
    }
}

/*  altenative implementation of merge

class Solution617 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null) return null;
        if(t1 != null && t2 == null) return t1;
        if(t1 == null && t2 != null) return t2;
        
        TreeNode mergeNode = new TreeNode(t1.val + t2.val);
        mergeNode.left = mergeTrees(t1.left, t2.left);
        mergeNode.right = mergeTrees(t1.right, t2.right);
        
        return mergeNode;
    }
}
 */