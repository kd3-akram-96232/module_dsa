package question_2;

class LinkedList {
	static class Node {
		int val;
		Node next;
		
		public Node(int val) {
			this.val = val;
			next = null;
		}
	}
	
	Node head;
	
	public void addFirst(int val) {
		Node newNode = new Node(val);
		
		if(head == null) {
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
		
	}
	
	public void addInSortedOrder(int newData) {
		Node newNode = new Node(newData);
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node temp = new Node(newData);
		while(temp.next.val < newData && temp.next != null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
		
	}
	
	public void display() {
		Node temp = head;
		while(temp != null) {			
			System.out.println(temp.val);
			temp = temp.next;
		}
	}


}

public class Main {
	
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.addFirst(50);
		list.addFirst(40);
		list.addFirst(30);
		list.addFirst(20);
		list.addFirst(10);
		
		list.addInSortedOrder(40);
		
		list.display();
		
	}

}
