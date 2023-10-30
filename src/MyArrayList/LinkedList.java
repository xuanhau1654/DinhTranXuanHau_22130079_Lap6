package MyArrayList;

public class LinkedList<E> {
	private Node<E> head; // Node đầu tiên trong danh sách
	private Node<E> tail; // Node cuối cùng trong danh sách
	private int size; // Số lượng phần tử trong danh sách

	public LinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public E first() {
		if (isEmpty()) {
			return null;
		}
		return head.getData();
	}

	public E last() {
		if (isEmpty()) {
			return null;
		}
		return tail.getData();
	}

	public void addFirst(E e) {
		Node<E> newNode = new Node<>(e, head);
		head = newNode;
		if (isEmpty()) {
			tail = head;
		}
		size++;
	}

	public void addLast(E e) {
		Node<E> newNode = new Node<>(e);
		if (isEmpty()) {
			head = newNode;
		} else {
			tail.setNext(newNode);
		}
		tail = newNode;
		size++;
	}

	public E removeFirst() {
		if (isEmpty()) {
			return null;
		}
		E removedData = head.getData();
		head = head.getNext();
		size--;
		if (isEmpty()) {
			tail = null;
		}
		return removedData;
	}

	public E removeLast() {
		if (isEmpty()) {
			return null;
		}
		if (size == 1) {
			E removedData = tail.getData();
			head = null;
			tail = null;
			size = 0;
			return removedData;
		}
		Node<E> current = head;
		while (current.getNext() != tail) {
			current = current.getNext();
		}
		E removedData = tail.getData();
		current.setNext(null);
		tail = current;
		size--;
		return removedData;
	}
}