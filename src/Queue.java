
/**
 * 
 * A class that implements a queue.  It is your job to complete this class.  Your queue
 * will use a linked list constructed by QueueElements.  However, your queue must be general and allow
 * setting of any type of Object.  Also you cannot use ArrayLists or arrays (you will get zero).  
 * @author you
 *
 */

import java.util.NoSuchElementException;

public class Queue<T> {
	// Tracks head and tail of the queue.
	private QueueElement<T> tail;
	private QueueElement<T> head;

	/**
	 * Constructs an empty Queue.
	 */
	public Queue() {
		this.tail = null;
		this.head = null;
	}

	/**
	 * Returns true if the queue is empty
	 */
	public boolean isEmpty() {
		if (this.head == null) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Returns the element at the head of the queue
	 */
	public T peek() throws NoSuchElementException {
		if (this.head == null) {
			throw new NoSuchElementException();
		}
		return this.head.getElement();
	}

	/**
	 * Removes the front element of the queue
	 */
	public void dequeue() throws NoSuchElementException {
		if (this.head == null) {
			throw new NoSuchElementException();
		}
		this.head = this.head.getNext();
		if (this.head == null) {
			this.tail = null;
		}
	}

	/**
	 * Puts an element on the back of the queue.
	 */
	public void enqueue(T element) {
		QueueElement<T> item = new QueueElement<T>(element, null);
		if (this.tail == null) {
			this.head = item;
			this.tail = item;
		}
		this.tail.setNext(item);
		this.tail = item;
	}

	/**
	 * Method to print the full contents of the queue in order from head to tail.
	 */
	public void print() {
		String s = "";
		Boolean empty = false;
		QueueElement<T> temp = this.head;
		if (temp == null) { // Check if the queue is empty.
			s += "The queue is empty.";
			empty = true;
		}
		while (!empty) { // Appends next item in queue to string while not empty.
			if (temp == null) {
				empty = true;
			} else {
				s += temp.getElement() + ",\n";
				temp = temp.getNext();
			}
		}

		System.out.println(s);
	}
}
