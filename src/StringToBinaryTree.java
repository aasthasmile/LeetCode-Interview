
/*
Definition for a binary tree node.*/
class Tree {
	int val;
	Tree left;
	Tree right;

	Tree(int x) {
		val = x;
	}
}

public class StringToBinaryTree {

	public static void main(String[] args) {

		Tree root = new Tree(1);
		root.left = new Tree(2);
		root.right = new Tree(3);
		root.left.left = new Tree(4);
		// root.left.right = new Tree(8);
		System.out.println(tree2str(root));

	}

	public static String tree2str(Tree t) {
		StringBuilder sb = new StringBuilder();
		treeToString(t, sb);
		return sb.toString();
	}

	private static void treeToString(Tree root, StringBuilder sb) {
		if (root == null) {
			return;
		} else {
			sb.append(root.val);
			if (root.left != null || root.right != null) {
				sb.append("(");
				// sb.append(root.val);

				treeToString(root.left, sb);
				sb.append(")");

				if (root.right != null)
					sb.append("(");
				treeToString(root.right, sb);

				sb.append(")");
			}
		}

	}

}
