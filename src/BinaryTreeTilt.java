class TreeNode {
	int val;
	Tree left;
	Tree right;

	TreeNode(int x) {
		val = x;
	}
}

public class BinaryTreeTilt {

	public static void main(String[] args) {

		Tree root = new Tree(3);
		root.left = new Tree(9);
		root.right = new Tree(20);
		root.right.left = new Tree(15);
		root.right.right = new Tree(7);

		System.out.println("left subtree sum " + sumOfLeftLeaves(root));
		System.out.println("right subtree sum " + sumOfRightLeaves(root,0));
		int diff = Math.abs(sumOfLeftLeaves(root) - sumOfRightLeaves(root,0));
		System.out.println(diff);
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

	public static int sumOfRightLeaves(Tree root,int sum) {
		if (root == null)
			return 0;
	
		sum += sumOfRightLeaves(root.left,sum);
		if (root.right != null) {
			sum += sumOfRightLeaves(root.right,sum);
			
		}
		
		return sum;
	}
}
