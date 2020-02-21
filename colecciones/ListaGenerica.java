package colecciones;

public interface ListaGenerica<E> {
	
	
	public boolean add(E e);
	public E get(int index);
	public boolean remove(E e);
	public boolean remove(int index);
	public int size();
	public void print();
	public void addAll(E[] e);
	public void addAll(ListaGenerica<E> l);
	

}
