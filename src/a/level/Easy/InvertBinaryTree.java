package a.level.Easy;

class InvertBinaryTree {

	public static void main(String[] args) {
		Treenode root = new Treenode(4);
		root.left = new Treenode(7);
		root.right = new Treenode(1);
		root.left.left = new Treenode(9);
		root.left.right = new Treenode(8);
		System.out.println(invertTree(root));
	}

	public static Treenode invertTree(Treenode root) {
		if (root == null)
			return null;
		else {
			invertTree(root.left);
			invertTree(root.right);
			Swap(root.left, root.right);
		}
		return root;

	}

	private static void Swap(Treenode left, Treenode right) {
		Treenode temp = left;
		left = right;
		right = temp;
	}
}
