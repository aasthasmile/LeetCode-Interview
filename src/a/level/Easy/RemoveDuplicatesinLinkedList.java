/**
 * 
 */
package a.level.Easy;

import java.util.Arrays;

/**
 * @author Aastha Jain
 *
 */
public class RemoveDuplicatesinLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/** removing duplicates in an array */
		int[] nums = new int[] { 1, 1, 2 };
		int length = nums.length;

		for (int i = 0; i < length- 1; i++) {
			if (nums[i] == nums[i + 1]) {
				nums[i + 1] = nums[nums.length - 1];
				length = length - 1;
				
				System.out.println("length" + length);
			}
		}
		Arrays.sort(nums);

		System.out.println(length);

	}

	public ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}

		ListNode curr = head;

		while (curr.next != null) {
			if (curr.val == curr.next.val)
				curr.next = curr.next.next;
			else
				curr = curr.next;

		}

		return head;

	}

}
