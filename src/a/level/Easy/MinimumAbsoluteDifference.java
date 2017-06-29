package a.level.Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//class TreeNode {
//	int val;
//	TreeNode left;
//	TreeNode right;
//
//	TreeNode(int x) {
//		val = x;
//	}
//}

public class MinimumAbsoluteDifference {

	public static void main(String[] args) {

	}

	public int getMinimumDifference(TreeNode root) {
		List<Integer> preOrder = new ArrayList<>();
		preOrderTraversal(root, preOrder);

		// preOrder.forEach(value -> System.out.println(value));

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < preOrder.size(); i++) {
			min = Math.min(min, Math.abs(preOrder.get(i) - preOrder.get(i + 1)));
		}

		return min;
	}

	private void preOrderTraversal(TreeNode root, List<Integer> preOrder) {
		if (root == null)
			return;
		else {
			preOrderTraversal(root.left, preOrder);
			preOrder.add(root.val);
			preOrderTraversal(root.right, preOrder);
		}

	}
}
