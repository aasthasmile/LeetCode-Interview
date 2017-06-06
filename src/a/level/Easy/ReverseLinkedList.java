package a.level.Easy;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// reverseList(head);
	}

	public static ListNode reverseList(ListNode head) {
		if(head==null || head.next==null){
			return head;
		}
		ListNode curr = head;
		ListNode prev = null;
		ListNode next = null;

		while (curr != null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}

		head=prev;
		return head;
	}

}
