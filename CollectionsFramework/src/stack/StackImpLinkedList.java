package stack;

public class StackImpLinkedList {
	
	// dynamic storing of elements 
	
	Node head;
	
	class Node{
		
		int data;
		Node next;
		
		Node(){
			this.next = null;
		}
	}
	
	// push method -- add value to beginning of list 
	
			public void push(int value) {
				Node new_Node = head;
				head = new Node();
				head.data = value;
				head.next = new_Node;
			}
			
			public int pop() {
				if(head == null) {
					System.out.println("Stack is empty");
				}
				
				int value = head.data;
				head = head.next; // removes element at top 
				return value; 
			}
	
			
	public static void main(String [] args) {
		
		StackImpLinkedList ll = new StackImpLinkedList();
		ll.push(10);
		ll.push(20);
		ll.push(30);
		ll.push(40);
		System.out.println("Element popped :: "+ll.pop());
	}
}
