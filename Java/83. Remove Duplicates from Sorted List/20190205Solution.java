//my answer

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class 20190205Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        int flag;
        ListNode result = head, temp = head;
        while(head.next != null){
            flag = head.val;
            temp = head.next;
            if(temp.val == flag){
                head.next = temp.next;
                continue;
            }
            if(head.next != null) head = head.next;
        }      
        return result;
    }
}

//best answer

/*
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
    ListNode current = head;
    while (current != null && current.next != null) {
        if (current.next.val == current.val) {
            current.next = current.next.next;
        } else {
            current = current.next;
        }
    }
    return head;
    }
}
*/