package tree;

public class BinaryTree {
    TreeNode root;

    public BinaryTree() {
        this.root = null;
    }

    void insert(int val) {
        TreeNode newNode = new TreeNode(val);
        if (root == null) {
            root = newNode;
            return;
        }
        TreeNode curr = root;
        while (curr != null) {
            if (val < curr.val) {
                if (curr.left == null) {
                    curr.left = newNode;
                    return;
                }
                curr = curr.left;
            } else if (val > curr.val) {
                if (curr.right == null) {
                    curr.right = newNode;
                }
                curr = curr.right;
            } else {
                return;
            }
        }
    }

    boolean search(int val) {
        TreeNode curr = root;
        while (curr != null)
            if (val == curr.val) return true;
            else if (val < curr.val) curr = curr.left;
            else curr = curr.right;
        return false;
    }

    TreeNode searchBST(TreeNode root, int val) {
        while (root != null)
            if (val == root.val) return root;
            else if (val < root.val) root = root.left;
            else root = root.right;
        return null;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(3);
        tree.insert(2);
        tree.insert(1);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);

//        System.out.println(tree);
//        System.out.println(tree.search(6));
        System.out.println(tree.searchBST(tree.root, 4));

    }

}
