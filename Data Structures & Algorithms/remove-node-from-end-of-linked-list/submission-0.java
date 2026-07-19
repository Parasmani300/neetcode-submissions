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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode temp = head;
        while(temp != null)
        {
            len++;
            temp = temp.next;
        }
        if(len == n)
            return head.next;

        int cnt = len-n-1;
        ListNode temp2 = head;
        while(cnt > 0){
            temp2 = temp2.next;
            cnt--;
        }
        
        temp2.next = temp2.next.next;
        return head;
    }
}
