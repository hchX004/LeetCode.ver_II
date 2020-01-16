//my answer

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
		next = null;
	}
}

//快慢指针法
class 20200116Solution(){
	public boolean hasCycle(ListNode head){
		if(head == null || head.next == null) return false;
		while(head != head.next){
			if(head.next == null || head.next.next == null) return false;
			head.next = head.next.next;
			head = head.next;
		}
		return true;
	}
}