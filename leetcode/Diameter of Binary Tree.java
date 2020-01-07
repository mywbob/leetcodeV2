/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    /*my BF, top down recur
    * find two cases, path including root and path not including root
    */
    /*
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        int lrl = longestRootToLeaf(root.left);
        int rrl = longestRootToLeaf(root.right);
        int lrtl = 0;
        if (lrl == 0 && rrl == 0) lrtl = 0;
        if (lrl == 0 && rrl != 0) lrtl = rrl;
        if (lrl != 0 && rrl == 0) lrtl = lrl;
        if (lrl != 0 && rrl != 0) lrtl = lrl + rrl;
        int l = diameterOfBinaryTree(root.left);
        int r = diameterOfBinaryTree(root.right);
        return Math.max(Math.max(l, r), lrtl);
    }
    
    public int longestRootToLeaf(TreeNode root) {
        if (root == null) return 0;
        return Math.max(longestRootToLeaf(root.left), longestRootToLeaf(root.right)) + 1;
    }
    */
    
    /*DFS
    * DFS the tree and keep track of max number
    * time: O(n) touched n nodes in DFS
    * space: O(n) call stack
    */
    int ans;
    public int diameterOfBinaryTree(TreeNode root) {
        ans = 1;
        depth(root);
        return ans - 1;
    }
    
    public int depth(TreeNode node) {//just dfs and extra code to track ans
        if (node == null) return 0;
        int L = depth(node.left);
        int R = depth(node.right);
        ans = Math.max(ans, L+R+1);
        return Math.max(L, R) + 1;
    }
}