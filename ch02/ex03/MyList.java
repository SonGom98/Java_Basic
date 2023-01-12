package ch02.ex03;

public interface MyList<T> {

	void add(T t);

	void insert(int index, T t);

	boolean remove(T t);
	boolean remove(int index);

	T get(int index);

	int size();
	
	void clear();
	boolean isEmpty();
	
	int indexOf(T t);
	boolean contains(T t);
}
