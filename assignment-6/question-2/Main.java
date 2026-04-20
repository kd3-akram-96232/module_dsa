class BSTSuccessor {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    Node root;

    Node insert(Node root, int val) {
        if (root == null) return new Node(val);

        if (val < root.data)
            root.left = insert(root.left, val);
        else
            root.right = insert(root.right, val);

        return root;
    }

    Node findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    Node successor(Node root, int key) {
        Node succ = null;

        while (root != null) {
            if (key < root.data) {
                succ = root;
                root = root.left;
            } else if (key > root.data) {
                root = root.right;
            } else {
                if (root.right != null) {
                    succ = findMin(root.right);
                }
                break;
            }
        }

        return succ;
    }

    public static void main(String[] args) {
        BSTSuccessor t = new BSTSuccessor();

        t.root = t.insert(t.root, 50);
        t.insert(t.root, 30);
        t.insert(t.root, 70);
        t.insert(t.root, 60);
        t.insert(t.root, 80);

        Node s = t.successor(t.root, 60);

        if (s != null)
            System.out.println(s.data);
        else
            System.out.println("No successor");
    }
}