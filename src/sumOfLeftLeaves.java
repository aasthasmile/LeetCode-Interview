/*class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}*/

public class sumOfLeftLeaves {

	public static void main(String[] args) {

		Tree root = new Tree(3);
		root.left = new Tree(9);
		root.right = new Tree(20);
		root.right.left = new Tree(15);
		root.right.right = new Tree(7);

		System.out.println(sumOfLeftLeaves(root));

	}

	
	public static int sumOfLeftLeaves(Tree root) {
		if (root == null)
			return 0;
		int sum = 0;
		if (root.left != null) {
			if (root.left.left == null && root.left.right == null)
				sum += root.left.val;
			else
				sum += sumOfLeftLeaves(root.left);
		}
		sum += sumOfLeftLeaves(root.right);
		return sum;
	}

}
