package linkedList;

import java.util.*;

public class LinkedListConcept {
	
	Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	public void display() {
		Node n = head;
		while(n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}
	
	public static void main(String [] args) {
		
//		List<Integer> list = new LinkedList<Integer>();
//		for(int i=0; i<10; i++) {
//			list.add(i);
//		}
//		System.out.println(list);
		
		LinkedListConcept ll = new LinkedListConcept();
		Node first = ll.new Node(10);
		ll.head = first;
		
		Node second = ll.new Node(20);
		first.next = second;
		
		Node third = ll.new Node(30);
		second.next = third;
		
		ll.display();
		
	}
}
