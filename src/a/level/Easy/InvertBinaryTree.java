package a.level.Easy;


class InvertBinaryTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(7);
		root.right = new TreeNode(1);
		root.left.left = new TreeNode(9);
		root.left.right = new TreeNode(8);
		System.out.println(invertTree(root));
	}

	public static TreeNode invertTree(TreeNode root) {
		
		if (root == null)
			return null;
		else {
			invertTree(root.left);
			invertTree(root.right);
			Swap(root.left, root.right);
		}
		return root;

	}

	private static void Swap(TreeNode left, TreeNode right) {
		TreeNode temp = left;
		left = right;
		right = temp;
	}
}
