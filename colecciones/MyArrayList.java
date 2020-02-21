package colecciones;

public class MyArrayList<E> extends GenericAbstractList<E> {

	private Object[] arraylist;
	private int index;

	public MyArrayList() {
		this.arraylist = new Object[5];
	}

	@Override
	public boolean add(E e) {
		if (index < arraylist.length) {
			arraylist[this.index] = e;
			this.index++;
			return true;
		} else {
			int indexTemporal = arraylist.length;
			growth();
			arraylist[indexTemporal] = e;
			this.index++;
			return true;
		}

	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(E e) {
		int indexTemporal = 0;
		for (int x = 0; x < this.index; x++) {
			if (this.arraylist[x] == e) {
				indexTemporal = x;
			}
		}
		for (int x = indexTemporal; x < this.index - 1; x++) {
			this.arraylist[x] = this.arraylist[x + 1];
		}
		return remove(indexTemporal);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.index;
	}

	@Override
	public void print() {
		for (int x = 0; x < index; x++) {
			System.out.println(arraylist[x]);
		}
	}

	private void growth() {
		Object[] arrayaux = new Object[this.arraylist.length * 2];
		for (int x = 0; x < this.arraylist.length; x++) {
			arrayaux[x] = this.arraylist[x];
		}
		arraylist = arrayaux;
	}

	@Override
	public boolean remove(int index) {
		for (int x = index; x < this.index - 1; x++) {
			this.arraylist[x] = this.arraylist[x + 1];
		}
		this.index--;
		return true;
	}

}
