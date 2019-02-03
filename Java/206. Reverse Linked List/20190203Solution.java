//my answer 100%

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class 20190203Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode n = head, p = null, m;
        while((m = n.next) != null){
            n.next = p;
            p = n;
            n = m;
        }
        n.next = p;
        return n;
    }
}