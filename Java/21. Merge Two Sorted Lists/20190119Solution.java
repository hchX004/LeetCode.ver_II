//my answer

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode result, temp;
        if(l1.val < l2.val){
            result = new ListNode(l1.val);
            l1 = l1.next;
            temp = result;
        } else {
            result = new ListNode(l2.val);
            l2 = l2.next;
            temp = result;
        }
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                temp.next = new ListNode(l1.val);
                temp = temp.next;
                l1 = l1.next;
            } else {
                temp.next = new ListNode(l2.val);
                temp = temp.next;
                l2 = l2.next;
            }
        }
        while(l1 != null){
            temp.next = new ListNode(l1.val);
            temp = temp.next;
            l1 = l1.next;
        }
        while(l2 != null){
            temp.next = new ListNode(l2.val);
            temp = temp.next;
            l2 = l2.next;
        }
        return result;
    }
}

//review the List