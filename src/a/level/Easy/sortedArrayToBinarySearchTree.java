package a.level.Easy;

public class sortedArrayToBinarySearchTree {

	public static void main(String[] args) {

	}

	/**
	 * Converting a Sorted Array as Binary Search Tree Parent at index i ,Left
	 * child at 2*i+1 ,Right child at 2*i+2 but We will use Binary Search
	 * Algorithm here. 1.Make the middle element of the list as the root of the
	 * tree. 2.Recursively calulcate the middle element of the left part and
	 * middle element of the right part. 3.Middle element of left part become
	 * left child of root and similarly middle element of right part becomes
	 * right child of root. 4.Repeat Step-2,3,4.
	 */
	public static TreeNode sortedArrayToBST(int[] nums) {
		int start = 0;

		int end = nums.length - 1;

		TreeNode root = constructBST(nums, start, end);
		return root;

	}

	private static TreeNode constructBST(int[] nums, int start, int end) {
		if (nums.length == 0)
			return null;
		
		/*
		 * when nums has only one node ,it becomes root.
		 */
		if (nums.length == 1)
			return new TreeNode(nums[0]);
		
		
		if (start >= end) {
			return null;
		}
		int mid = (start + end) / 2;
		TreeNode root = new TreeNode(nums[mid]);
		root.left = constructBST(nums, start, mid - 1);
		root.right = constructBST(nums, mid + 1, end);

		return root;

	}

}
