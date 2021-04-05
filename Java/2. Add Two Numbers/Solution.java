// 20190127

// my answer 100%

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode p = l1, q = l2, n = result;
        int x, y, c = 0;
        while(p != null || q != null){
            if(p != null) x = p.val;
            else x = 0;
            if(q != null) y = q.val;
            else y = 0;
            int sum = x + y + c;
            c = sum / 10;
            n.next = new ListNode(sum % 10);
            n = n.next;
            if(p != null) p = p.next;
            if(q != null) q = q.next;
        }
        if(c != 0) n.next = new ListNode(c);
        return result.next;
    }
}