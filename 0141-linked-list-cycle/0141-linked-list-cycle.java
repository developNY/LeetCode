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
        while(next != null && next.next != null){
            if(head == next)
                return true;
            head = head.next;
            next = next.next.next;
        }

        return false;
    }
}