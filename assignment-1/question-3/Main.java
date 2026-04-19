class LinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void insertSorted(int value) {
        Node newNode = new Node(value);

        if (head == null || value < head.data) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null && temp.next.data < value) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertSorted(30);
        list.insertSorted(10);
        list.insertSorted(20);
        list.insertSorted(40);

        list.display();
    }
}