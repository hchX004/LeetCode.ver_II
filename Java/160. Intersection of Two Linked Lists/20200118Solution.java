//my answer


public class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
		next = null;
	}
}

//速度一样，走过的路程一样，一定会在相交的点相遇
public class 20200118Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
    	ListNode pA = headA, pB = headB;
    	while (pA != pB) {
        	pA = pA == null ? headB : pA.next;		//pA到了末尾，则pA = headB继续遍历
        	pB = pB == null ? headA : pB.next;		//pB到了末尾，则pB = headA继续遍历
    	}
    	return pA;
    }
}