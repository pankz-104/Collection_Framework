package stack;

public class StackImpArray {

	// LIFO (Last In First Out) 
	// push -- in and pop -- out
	// isEmpty()
	// isFull()
	// peek -- return top element from stack without removing it 
	// operations from top only 
	// time complexity of all operations -- O(1)
	
	int size;
	int arr[];
	int top;
	
	StackImpArray(int size){
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}
	
	
	public void push(int element) {
		
		if(!isFull()) {
			top++;
			arr[top] = element;
			System.out.println("Element pushed :: "+element);
		}
		else {
			System.out.println("Stack is full now");
		}
	}
	
	public int pop() {
		if(!isEmpty()) {
			int delVar = top;
			top--;
			System.out.println("Element popped :: "+delVar);
			return arr[delVar];
		}
		else {
			System.out.println("Stack is empty, cannot remove element");
			return -1;
		}
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (size - 1 == top);
	}
	
	public int peek(){
		if(!this.isEmpty()) {
			return arr[top];
		}
		else {
			System.out.println("stack is empty");
			return -1;
		}
	}
	
	public static void main(String[] args) {

		StackImpArray stack = new StackImpArray(10);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
		System.out.println(stack.isEmpty());
		System.out.println(stack.isFull());
	}
}
