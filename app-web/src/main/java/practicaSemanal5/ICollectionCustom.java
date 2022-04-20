package practicaSemanal5;

public interface ICollectionCustom<T> {
	
	public int size();
	public void addFirst(T value);
	public void addLast(T value);
	public void add(T value);
	public T remove(T value);
	public void removeAll();
	public boolean empty();

}
