class CircularList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node tail;

    void addLast(int val) {
        Node n = new Node(val);

        if (tail == null) {
            tail = n;
            tail.next = tail;
            return;
        }

        n.next = tail.next;
        tail.next = n;
        tail = n;
    }

    void addFirst(int val) {
        Node n = new Node(val);

        if (tail == null) {
            tail = n;
            tail.next = tail;
            return;
        }

        n.next = tail.next;
        tail.next = n;
    }

    void removeFirst() {
        if (tail == null) return;

        if (tail.next == tail) {
            tail = null;
            return;
        }

        tail.next = tail.next.next;
    }

    void removeLast() {
        if (tail == null) return;

        if (tail.next == tail) {
            tail = null;
            return;
        }

        Node temp = tail.next;

        while (temp.next != tail) {
            temp = temp.next;
        }

        temp.next = tail.next;
        tail = temp;
    }

    void show() {
        if (tail == null) return;

        Node temp = tail.next;

        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != tail.next);

        System.out.println();
    }

    public static void main(String[] args) {
        CircularList l = new CircularList();

        l.addLast(10);
        l.addLast(20);
        l.addFirst(5);
        l.addLast(30);

        l.show();

        l.removeFirst();
        l.removeLast();

        l.show();
    }
}