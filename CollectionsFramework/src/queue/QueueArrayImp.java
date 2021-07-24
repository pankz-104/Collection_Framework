package queue;

public class QueueArrayImp {

	int capacity;
	int queueArr[];
	int rear;
	int front;
	int currentSize;
	
	public QueueArrayImp(int sizeOfQueue) {
		this.capacity = sizeOfQueue;
		front = 0;
		rear = -1;
		queueArr = new int[this.capacity];
	}
	
	// insertion from front 
	public void enqueue(int element) {
		if(isFull()) {
			System.out.println("Queue is full, cannot insert data");
		}
		else {
			rear++;
			if(rear == capacity - 1) {
				rear = 0;
			}
			queueArr[rear] = element;
			currentSize++;
			System.out.println("Element added is :: "+element);
		}
	}
	
	// removal from rear 
	public void dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty, cannot pop element");
		}
		else {
			front++;
			if(front == capacity - 1) {
				System.out.println(queueArr[front - 1]+" removed");
				front = 0;
			}
			else {
				System.out.println(queueArr[front - 1]+" removed");
			}
		}
	}
	
	public boolean isEmpty() {
		if(rear == front - 1) 
			return true;
		return false;
	}
	
	public boolean isFull() {
		if(currentSize == capacity) 
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		QueueArrayImp q = new QueueArrayImp(10);
		q.enqueue(10);
//		q.dequeue();
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		System.out.println(q.isEmpty());
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		System.out.println(q.isEmpty());
		q.enqueue(9000);
		q.dequeue();
		System.out.println(q.isFull());
		System.out.println(q.isEmpty());
	}
}
