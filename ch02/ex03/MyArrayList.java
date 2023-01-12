package ch02.ex03;

import java.util.Arrays;

public class MyArrayList<T> implements MyList<T> {

	private int size;
	private T[] elements;

	public MyArrayList() {
		this.size = 0;
		this.elements = (T[]) new Object[50];
	}

	@Override
	public void add(T t) { // [0] [1] [2]
		if (this.size == this.elements.length) {
			this.elements = Arrays.copyOf(this.elements, this.size * 2);
		}
		this.elements[size++] = t;
	}

	@Override
	public void insert(int index, T t) {
		if (this.size == this.elements.length) {
			this.elements = Arrays.copyOf(this.elements, this.size * 2);
		}
		for (int i = index; i < this.size; i++) {
			this.elements[i + 1] = this.elements[i];

		}
		this.elements[index] = t;
		this.size++;
	}

	@Override
	public boolean remove(T t) {
		for(int i=0; i<this.size; i++) {
			if (this.elements[i].equals(t)) {
				for(int j=i; j<this.size-1; j++) {
					this.elements[j] = this.elements[j+1];
 				}
				this.size--;
				return true;
			}
		}
		
		return false;
	}

	@Override
	public boolean remove(int index) {
		if(index<0 || index>this.size) {
			return false;
		}
		for (int i = index; i < this.size-1; i++) {
			this.elements[i] = this.elements[i+1];
		}
		this.size--;

		return true;
	}

	@Override
	public T get(int index) {
		if (this.size <= index) {
			throw new IndexOutOfBoundsException();
		}
		return this.elements[index];
	}

	@Override
	public int indexOf(T t) {
		for(int i=0; i<this.size; i++) {
			if (this.elements[i].equals(t)) {
				return i;
			}
		}
		return -1;
	}
	
	@Override
	public int size() {
		return this.size;
	}

	@Override
	public void clear() {

		this.size = 0;
	}

	@Override
	public boolean isEmpty() {
		
		return this.size ==0;
	}

	@Override
	public boolean contains(T t) {
		for(T el : this.elements) {
			if(el.equals(t)) {
				return true;
			}else return false;
		}
		return false;
	}

}
