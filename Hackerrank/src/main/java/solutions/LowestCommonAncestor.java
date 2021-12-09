package main.java.solutions;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

/**
 * Hackerrank Binary Search Tree : Lowest Common Ancestor 문제 솔루션
 *
 * @Date 2021/12/09
 * @Author Oh Donggeon
 * @See https://www.hackerrank.com/challenges/binary-search-tree-lowest-common-ancestor
 */
public class LowestCommonAncestor {

    public static Node lca(Node root, int v1, int v2) {
        while(root != null) {
            if (root.data > v1 && root.data > v2) {
                root = root.left;
            } else if (root.data < v1 && root.data < v2) {
                root = root.right;
            } else {
                break;
            }
        }
        return root;
    }

}