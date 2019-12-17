/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    /* recur
    * time: O(n), how to do this in a standard way for recur?
    * space: O(n) call stack depth
    */
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;
        ListNode newHead = reverseList(head.next);
        ListNode newTail = head.next;
        newTail.next = head;
        newTail = head;
        newTail.next = null;
        return newHead;
    }
    
    /* BF
    * time: O(n)
    * space: O(1) extra
    */
    /*
    public ListNode reverseList(ListNode head) {
        ListNode runner = head;
        if (runner == null || runner.next == null) return runner;
        ListNode nextNode = runner.next;
        ListNode nextNextNode = nextNode.next;
        while (nextNextNode!=null) {
            nextNode.next = runner;
            runner = nextNode;
            nextNode = nextNextNode;
            nextNextNode = nextNextNode.next;
        }
        nextNode.next = runner;
        head.next = null;
        return nextNode;
    }
}