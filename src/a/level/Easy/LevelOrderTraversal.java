/**
 * 
 */
package a.level.Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Aastha Jain
 *
 */
public class LevelOrderTraversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static List<List<Integer>> levelOrderBottom(TreeNode root) {

		List<List<Integer>> levelOrder = new ArrayList<>();

		if (root == null)
			return levelOrder;

		Queue<TreeNode> queue = new LinkedList<TreeNode>();

		queue.add(root);

		while (!queue.isEmpty()) {
			int length = queue.size();
			List<Integer> levels = new ArrayList<>();
			for (int i = 0; i < length; i++) {
				TreeNode element = queue.poll();
				if (element.left != null)
					queue.add(element.left);
				if (element.right != null)
					queue.add(element.right);
				levels.add(element.val);
			}
			levelOrder.add(levels);
		}

		Collections.reverse(levelOrder);
		
		return levelOrder;

	}

}
