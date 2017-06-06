
class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class MergeTwoSortedLinkedList {

	public static void main(String[] args) {

		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(6);
		l1.next.next = new ListNode(9);

		ListNode l2 = new ListNode(3);
		l2.next = new ListNode(4);
		l2.next.next = new ListNode(12);

		mergeTwoLists(l1, l2);
	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		
		if(l1==null) return l2;
		if(l2==null) return l1;
		
		if (l1.val < l2.val) {
	        l1.next = mergeTwoLists(l1.next, l2);
	        return l1;
	    } else {
	        l2.next = mergeTwoLists(l2.next, l1);
	        return l2;
	    }

	}

	

}
