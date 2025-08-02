package DSA1.Trees;

public class InvertTree {

    // Static nested TreeNode class
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = temp;
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        InvertTree obj = new InvertTree();
        TreeNode inverted = obj.invertTree(root);

        // Check result by printing root values
        System.out.println("Root after invert: " + inverted.val); // 4
        System.out.println("Left child: " + inverted.left.val);    // 7
        System.out.println("Right child: " + inverted.right.val);  // 2
    }
}
