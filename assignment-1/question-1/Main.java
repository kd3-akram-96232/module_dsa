package question_1;

import java.util.Stack;

// Write all possibilites to check palindrome(number, array, string, linked list, tree) on paper. Also do time
//and space complexity analysis of all and compare.

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
	
	public void addLast(int val) {
			Node newNode = new Node(val);
			
			Node temp = head;
			
			if(temp == null) {
				head = newNode;
				return;
			}
			
			while(temp.next != null) {
				temp = temp.next;
			}
			
			temp.next = newNode;
			
	}
	
	public boolean isPalindrome() {
		Stack<Integer> stack = new Stack<>();
		
		Node fast = head;
		Node slow = head;
		
		while(fast != null && fast.next != null) {
			
			stack.push(slow.val);
			
			slow = slow.next;
			
			fast = fast.next.next;
		}
		
		// this for even or odd
		if(fast != null && fast.next == null) {
			slow = slow.next;
		}
		
		Node temp = head;
		
		while(!stack.isEmpty()) {
			
			if(stack.pop() != slow.val) {
				return false;
			}
			
			slow = slow.next;			
		}
		return true;
		
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
		
		list.addLast(33);
		list.addLast(42);
		list.addLast(53);
		list.addLast(53);
		list.addLast(42);
		list.addLast(33);
		
//		list.display();
		
		boolean isPalindrome = list.isPalindrome();
		
		System.out.println(isPalindrome);
		
		
		
		
	}

}
