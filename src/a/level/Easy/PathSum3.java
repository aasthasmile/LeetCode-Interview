/**
 * 
 */
package a.level.Easy;

/**
 * @author Aastha Jain
 *
 */
public class PathSum3 {

	// static int count = 0;

	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(5);
		root.right = new TreeNode(-3);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(2);
		root.right.right = new TreeNode(11);
		root.left.left.left = new TreeNode(3);
		root.left.left.right = new TreeNode(-2);
		root.left.right.right = new TreeNode(1);

	}

	static int counter = 0;

	public static int pathSum(TreeNode root, int sum) {

		if (root == null)
			return 0;

		return sum(root, sum) + sum(root.left, sum) + sum(root.right, sum);

		// return counter;

	}

	public static int sum(TreeNode root, int sum) {

		if (sum == root.val) {
			counter++;
			System.out.println("counter :" + counter);
			// return true;
		}

		if (root.left != null)
			return (sum(root.left, sum - root.val));

		if (root.right != null)
			return (sum(root.right, sum - root.val));
		return sum;

	}

}
