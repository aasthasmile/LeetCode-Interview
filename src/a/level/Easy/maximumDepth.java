package a.level.Easy;

/*class Treenode {
	int val;
	Treenode left;
	Treenode right;

	Treenode(int x) {
		val = x;
	}
}*/

public class maximumDepth {

	public static void main(String[] args) {
		Treenode root = new Treenode(3);
		root.left = new Treenode(4);
		root.right = new Treenode(3);
		root.left.left = new Treenode(8);
		System.out.println(maxDepth(root));

	}

	public static int maxDepth(Treenode root) {
		if (root == null)
			return 0;

		int left = maxDepth(root.left);
		int right = maxDepth(root.right);

		return Math.max(left, right) + 1;
	}

}
