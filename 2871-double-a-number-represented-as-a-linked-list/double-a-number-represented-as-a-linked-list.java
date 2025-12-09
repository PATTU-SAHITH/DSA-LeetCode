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
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public ListNode doubleIt(ListNode head) {
        if(head==null) return head;

        head = reverse(head);

        ListNode current = head;
        int carry = 0;

        while(current!=null){
            int num = current.val * 2 + carry;
            current.val = num%10;
            carry = num/10;
            current = current.next;
        }

        head = reverse(head);

        if(carry!=0){
            ListNode dummy = new ListNode(carry,head);
            return dummy;
        }

        return head;
        
    }
}