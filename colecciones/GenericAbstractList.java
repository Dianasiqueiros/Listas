package colecciones;

public abstract class GenericAbstractList<E> implements ListaGenerica<E> {

	@Override
	public void addAll(E[] e) {
		for (int i = 0; i < e.length; i++) {

			add(e[i]);
		}
	}

	@Override
	public void addAll(ListaGenerica<E> l) {
		for (int i = 0; i < l.size(); i++) {

			add(l.get(i));
		}

	}
}
