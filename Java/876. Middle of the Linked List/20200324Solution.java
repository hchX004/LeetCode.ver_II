


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

// 快慢指针

class 20200324Solution {
    public ListNode middleNode(ListNode head) {
        ListNode lowNode = head;
        ListNode fastNode = head;
        while(lowNode != null && fastNode != null && fastNode.next != null){
            lowNode = lowNode.next;
            fastNode = fastNode.next.next;
        }
        return lowNode;
    }
}