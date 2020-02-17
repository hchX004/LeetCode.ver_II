//空间复杂度O(1),时间复杂度O(n)


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class 20200218Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null) return true;
        ListNode half = halfNode(head);
        //将中点后的链表翻转与之前的的一半链表对比
        ListNode reverseNode = reverseList(half.next);
        //检查回文
        ListNode start = head;
        ListNode mid = reverseNode;
        while(mid != null){
            if(mid.val != start.val) return false;
            mid = mid.next;
            start = start.next;
        }
        return true;
    }
    //使用快慢指针找到中点
    private ListNode halfNode(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    //返回翻转链表头结点
    private ListNode reverseList(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        while(cur != null){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
}


/*
class Solution {
    public boolean isPalindrome(ListNode head) {
        //1.判断是否是一个节点
        if (head == null || head.next == null)  return true;
        //2判断是否是2个节点
        if (head.next.next == null) return head.val == head.next.val;
        //如果都不是
        //1.设定一个slow指针指向当前回文遍历的字符，设定一个fast指针，遍历到slow对应回文的后面的节点的前一个节点，也就是fast.next.val==slow.val
        ListNode slow = head, fast = head.next;
        //2.这样不断循环推进slow，然后把fast设置为slow.next开始遍历，循环后退，每次匹配成功，然后就把fast后面的断开，并把slow推进
        //如果匹配不成功，则继续推进fast到fast.next==null位置说明没有位置匹配了
        while (fast.next != null) {
            if (slow.val == fast.next.val) {
                //如果匹配成功
                if (fast.next.next != null) {
                    //如果不是和最后一个位置的字符匹配，说明回文中间掺杂其他字符，不连续
                    return false;
                } else {
                    fast.next = null;
                    slow = slow.next;
                    fast = slow.next;
                }
                //判断是否循环结束,这里区分奇和偶，如果是奇数个回文
                if (fast == null || (fast.next == null && slow.val == fast.val)) {
                    return true;
                }
            } else {
                fast = fast.next;
            }
        }
        return false;
    }
}
 */