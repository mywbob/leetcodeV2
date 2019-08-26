/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/*
 * Brute force recursion method
 * time: O(n), n is number of nodes in tree
 * space: depth of the recursion tree: O(logn) on avg, O(n) worst case for a skewed tree
 */
/*
 * TODO: Iterative method
 */
class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 != null) return t2;
        if (t1 != null && t2 == null) return t1;
        if (t1 == null && t2 == null) return null;
        TreeNode newRoot = new TreeNode(t1.val + t2.val);
        TreeNode newLeft = mergeTrees(t1.left, t2.left);
        TreeNode newRight = mergeTrees(t1.right, t2.right);
        newRoot.left = newLeft;
        newRoot.right = newRight;
        return newRoot;
    }
}