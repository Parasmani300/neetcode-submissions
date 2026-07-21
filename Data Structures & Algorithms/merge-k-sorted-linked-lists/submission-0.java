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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> heap = new PriorityQueue<>((a,b) -> a.val - b.val);

        for(ListNode list : lists){
            heap.offer(list);
        }

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        while(!heap.isEmpty())
        {
            ListNode small = heap.poll();
            curr.next = small;
            curr = curr.next;

            if(small.next != null)
            {
                heap.offer(small.next);
            }
        }

        return dummy.next;
    }
}
