class CircularList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node tail;

    void addAtPos(int val, int pos) {
        Node n = new Node(val);

        if (tail == null) {
            if (pos == 1) {
                tail = n;
                tail.next = tail;
            }
            return;
        }

        if (pos == 1) {
            n.next = tail.next;
            tail.next = n;
            return;
        }

        Node temp = tail.next;
        int i = 1;

        while (i < pos - 1 && temp != tail) {
            temp = temp.next;
            i++;
        }

        n.next = temp.next;
        temp.next = n;

        if (temp == tail) {
            tail = n;
        }
    }

    void deleteAtPos(int pos) {
        if (tail == null) return;

        if (pos == 1) {
            if (tail.next == tail) {
                tail = null;
                return;
            }
            tail.next = tail.next.next;
            return;
        }

        Node temp = tail.next;
        int i = 1;

        while (i < pos - 1 && temp.next != tail.next) {
            temp = temp.next;
            i++;
        }

        Node del = temp.next;
        temp.next = del.next;

        if (del == tail) {
            tail = temp;
        }
    }

    void show() {
        if (tail == null) return;

        Node temp = tail.next;

        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != tail.next);

        System.out.println();
    }

    public static void main(String[] args) {
        CircularList l = new CircularList();

        l.addAtPos(10, 1);
        l.addAtPos(20, 2);
        l.addAtPos(30, 3);
        l.addAtPos(15, 2);

        l.show();

        l.deleteAtPos(1);
        l.deleteAtPos(3);

        l.show();
    }
}