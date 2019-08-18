package dsa;

class Node {
    int value;
    Node leftchild;
    Node rightChild;

    Node(int item) {
        this.value = item;
        leftchild = rightChild = null;

    }
}

public class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    BinaryTree(int item) {
        root = new Node(item);
    }

    public void inOrderTraversal(Node n) {
        if (n != null) {
            inOrderTraversal(n.leftchild);
            System.out.print(n.value + "  ");
            inOrderTraversal(n.rightChild);
        }

    }

    public void postOrderTraversal(Node n) {
        if (n != null) {
            postOrderTraversal(n.leftchild);
            postOrderTraversal(n.rightChild);
            System.out.print(n.value + "  ");
        }

    }


    public void preOrderTraversal(Node n) {
        if (n != null) {
            System.out.print(n.value + "  ");
            preOrderTraversal(n.leftchild);
            preOrderTraversal(n.rightChild);
        }

    }

    public static void main(String[] args) {
        BinaryTree theTree = new BinaryTree();
        theTree.root = new Node(2);
        theTree.root.leftchild = new Node(1);
        theTree.root.rightChild = new Node(3);
        System.out.println("Inorder Tree Traversal ....");
        theTree.inOrderTraversal(theTree.root);
        System.out.println();
        System.out.println("Post Order Tree Traversal ....");
        theTree.postOrderTraversal(theTree.root);
        System.out.println();
        System.out.println("Preorder Tree Traversal ....");
        theTree.preOrderTraversal(theTree.root);
    }
}
