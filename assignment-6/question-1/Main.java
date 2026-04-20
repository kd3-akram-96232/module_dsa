class BSTLevel {

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

    int level(Node root, int key, int lvl) {
        if (root == null) return -1;

        if (root.data == key) return lvl;

        if (key < root.data)
            return level(root.left, key, lvl + 1);
        else
            return level(root.right, key, lvl + 1);
    }

    public static void main(String[] args) {
        BSTLevel t = new BSTLevel();

        t.root = t.insert(t.root, 50);
        t.insert(t.root, 30);
        t.insert(t.root, 70);
        t.insert(t.root, 20);
        t.insert(t.root, 40);

        System.out.println(t.level(t.root, 40, 0));
    }
}