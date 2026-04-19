class StackLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node top;

    void push(int val) {
        Node n = new Node(val);
        n.next = top;
        top = n;
    }

    void pop() {
        if (top == null) {
            System.out.println("Stack empty");
            return;
        }
        top = top.next;
    }

    void peek() {
        if (top == null) {
            System.out.println("Stack empty");
            return;
        }
        System.out.println(top.data);
    }

    void show() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}