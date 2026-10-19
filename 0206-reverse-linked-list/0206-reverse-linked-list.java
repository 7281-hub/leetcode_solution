/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
      ListNode prev = null;
      ListNode curr = head; 

        while (curr != null) {
            // Save the next node before changing any link
            ListNode next = curr.next;
            // Reverse current node link
            curr.next = prev;
            // Move pointers
            prev = curr;
            // Move to next node
            curr = next;
        }
            head = prev;
            return prev;
    }
    }