/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null)
            return false;
        ListNode next = head.next;
        while(next != null){
            if(head == next)
                return true;
            head = head.next;
            if(next.next == null || next.next.next == null)
                return false;
            next = next.next.next;
        }

        return false;
    }
}