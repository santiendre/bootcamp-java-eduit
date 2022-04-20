package practicaSemanal5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CollectionCustom<T> implements ICollectionCustom<T>{
	
	private T[] elements;
	private final Class<T> type;

	@SuppressWarnings("unchecked")
	public CollectionCustom(Class<T> type, int size) {
		this.elements = (T[])Array.newInstance(type, size);
		this.type = type;
	}
	public void insertInPosition(int index, T value) {
		elements[index] = value; 
	}
	
	@Override
	public int size() {
		return elements.length;
	}

	@Override
	public void addFirst(T value) {
		@SuppressWarnings("unchecked")
		T[] tempArray = (T[])Array.newInstance(type, elements.length + 1);
		tempArray[0] = value;
		for(int i = 0; i < elements.length; i++) {
			tempArray[i+1] = elements[i];
		}
		this.elements = tempArray;
	}

	@Override
	public void addLast(T value) {
		int size = elements.length;
		T[] tempArray = Arrays.copyOf(elements, size + 1);
		tempArray[size] = value;
		this.elements = tempArray;		
	}

	@Override
	public void add(T value) {
		int size = elements.length;
		T[] tempArray = Arrays.copyOf(elements, size + 1);
		tempArray[size] = value;
		this.elements = tempArray;		
	}

	@Override
	public T remove(T value) {
		T elementRemoved = null;
		boolean searching = true; 
		for(int i = 0; i < elements.length && searching; i++) {
			if(elements[i] == value) {
				elementRemoved = value;
				searching = false;
				@SuppressWarnings("unchecked")
				T[] tempArray = (T[])Array.newInstance(type, elements.length - 1);
				for(int j = 0, k = 0; j < elements.length; j ++) {
					if(j != i) {
						tempArray[k] = elements[j];
						k++;
					}
				}
				this.elements = tempArray;
			}
		}
		return elementRemoved;	
	}

	@Override
	public void removeAll() {
		@SuppressWarnings("unchecked")
		T[] tempArray = (T[])Array.newInstance(type, 0);
		this.elements = tempArray;
	}

	@Override
	public boolean empty() {


		return elements.length == 0 ? true : false;
	}
	

	@Override
	
	public String toString() {
		return "CollectionCustom [elements=" + Arrays.toString(elements) + "]";
	}
	
	
}
