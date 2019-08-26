/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
/*
 * Brute force method
 * time: O(n), n is number of node in tree
 * space: O(logn) on avg, O(n) worse case. n is the depth of recursion tree
 */
/*
class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<Integer>();
        if (root == null) return result;
        result.add(root.val);
        for (Node node : root.children) {
            result.addAll(preorder(node));
        }
        return result;
    }
}
*/
/*
 * Iteratively, use a stack to store state, this is not same as recusion call stack
 * time: O(n)
 * space: O(n) worst case
 */
class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<Integer>();
        Stack<Node> stack = new Stack<>();
        if (root == null) return result;
        stack.push(root);
        while (!stack.empty()) {
            Node node = stack.pop();
            result.add(node.val);
            for (int i=node.children.size()-1; i>=0; i--) {
                stack.push(node.children.get(i));
            }
        }
        return result;
    }
}
