package algoritms;

public class TreeAlgorithm {
    // Class containing left and
    // right child of current
    // node and key value
    static class Node {
        int key;
        Node left;
        Node right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    // Root of BST
    Node root;

    // Constructor
    TreeAlgorithm() {
        root = null;
    }

    // This method mainly
    // calls insertRec()
    void insert(int key) {
        root = insertRec(root, key);
    }

    /* A recursive function to
    insert a new key in BST */
    Node insertRec(Node root, int key) {

        /* If the tree is empty,
        return a new node */
        if (root == null) {
            root = new Node(key);
            return root;
        }

        /* Otherwise, recur
        down the tree */
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        /* return the root */
        return root;
    }

    // A function to do
    // inorder traversal of BST
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    void treeIns(int[] arr) {
        for (int j : arr) {
            insert(j);
        }
    }

    // Driver Code
    public static void main(String[] args) {
        TreeAlgorithm tree = new TreeAlgorithm();
        int[] arr = {5, 4, 7, 2, 11};
        tree.treeIns(arr);
        tree.inorderRec(tree.root);
    }
}
