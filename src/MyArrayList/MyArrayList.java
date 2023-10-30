package MyArrayList;

import java.util.ArrayList;
import java.util.Comparator;

public class MyArrayList<E> {
	public static final int DEFAULT_CAPACITY = 10;
	private E[] elements;
	private int size;

	public MyArrayList() {
		this.elements = (E[]) new Object[DEFAULT_CAPACITY];
	}

	public MyArrayList(int capacity) {
		this.elements = (E[]) new Object[capacity];
	}

	// creates an array of double-size if the array of

	public void growSize() {
		int newCapacity= elements.length*2;
		E[]newElements=(E[])new Object[newCapacity];
		for (int i = 0; i < size; i++) {
			newElements[i]=elements[i];
		}
		newElements=elements;
	}

	// Returns the number of elements in this list.
	public int size() {
		return size;
	}

	// Returns whether the list is empty.
	public boolean isEmpty() {
		return size==0;
	}

	// Returns (but does not remove) the element at index i.
	public E get(int i) throws IndexOutOfBoundsException {
		return elements[i];

	}

	// Replaces the element at index i with e, and

	public E set(int i, E e) throws IndexOutOfBoundsException {
		elements[i]=e;
		return e;
	}

	// It is used to append the specified element at the

	public boolean add(E e) {
		if(size==elements.length) {
			growSize();
		}
		elements[size]=e;
		size++;
		return true;
	}

	// Inserts element e to be at index i, shifting all

	public void add(int i, E e) throws IndexOutOfBoundsException {
	}

	// Removes and returns the element at index i,

	public E remove(int i) throws IndexOutOfBoundsException {
		for (int j = 0; j < size; j++) {
			elements[i]=elements[i+1];
		}
size--;
return elements[i];

}

	// It is used to clear all elements in the list.
	public void clear() {
		for (int i = 0; i < size; i++) {
			elements[i]=null;
			
		}
		size=0;
	}

	// It is used to return the index in this list of the

	public int lastIndexOf(Object o) {
		if(isEmpty()) {
			return size-1;
		}
		return -1;
	}

	// It is used to return an array containing all of the

	public E[] toArray() {
		E[]array=(E[])new Object[size];
		for (int i = 0; i <size; i++) {
			array[i]=elements[i];
		}
		return array;
	}

	// It is used to return a shallow copy of an ArrayList.
	public MyArrayList<E> clone() {
		return null;
	}
	// It returns true if the list contains the specified

	public boolean contains(E o) {
		return false;
	}

	// It is used to return the index in this list of the

	public int indexOf(E o) {
		return -1;
	}

	// It is used to remove the first occurrence of the

	public boolean remove(E e) {
		return false;
	}

	// It is used to sort the elements of the list on the

	public void sort(Comparator<E> c) {
	}
}
