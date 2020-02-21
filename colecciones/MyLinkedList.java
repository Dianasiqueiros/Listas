package colecciones;

public class MyLinkedList<E> extends GenericAbstractList<E> {
	private Node<E> node;
	int size = 0;

	@Override
	public boolean add(E e) {
		Node<E> actual = node;
		if (this.node == null) {
			node = new Node<>(e);

		} else {
			while (actual != null) {
				if (actual.getNext() == null) {
					actual.setNext(new Node<>(e));
				}
				actual = actual.getNext();
			}

		}
		this.size++;
		return true;
	}

	@Override
	public E get(int index) {
		int cont = 0;
		Node<E> actual = node;
		if (index == 0) {
			return this.node.getData();
		}
		while (actual != null) {
			if (cont == index) {
				return actual.getData();
			}
			cont++;
			actual = actual.getNext();
		}
		return null;
	}

	@Override
	public boolean remove(E e) {
		Node<E> actual = node;
		if (actual.getData() == e) {
			this.node = this.node.getNext();
			this.size--;
			return true;
		}
		while (actual != null) {
			if (actual.getNext() != null)
				if (actual.getNext().getData() == e) {
					actual.setNext(actual.getNext().getNext());
					this.size--;
					return true;
				}
			actual = actual.getNext();
		}
		return true;
	}

	@Override
	public boolean remove(int index) {
		int cont = 1;
		Node<E> actual = node;
		if (index == 0) {
			actual = actual.getNext();
			this.size--;
			return true;
		}
		while (actual != null) {
			if (cont == index) {
				actual.setNext(actual.getNext().getNext());
				this.size--;
				return true;
			}
			cont++;
			actual = actual.getNext();
		}
		return true;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.size;
	}

	@Override
	public void print() {
		Node<E> actual = node;
		while (actual != null) {
			System.out.println(actual.getData());
			actual = actual.getNext();
		}
	}

}
