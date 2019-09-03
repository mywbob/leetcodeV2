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
 * time: O(n)
 * space: O(n) worst, O(logn) avg
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode leftI = invertTree(root.left);
        TreeNode rightI = invertTree(root.right);
        root.left = rightI;
        root.right = leftI;
        return root;
    }
}