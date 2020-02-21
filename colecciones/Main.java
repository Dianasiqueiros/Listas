package colecciones;

public class Main 
{
	public static void main(String args[])
	{
		ListaGenerica<String> lista = new MyLinkedList<String>();
		lista.add("1");
		lista.add("2");
		lista.add("3");
		lista.add("4");
		lista.add("5");
		lista.add("6");
		lista.add("7");
		lista.add("8");
		lista.addAll(new String[]{"9","10"});
		lista.print();
		System.out.println();
		
		
		lista.remove(3);
		lista.print();
		System.out.println();
		
		lista.remove("1");
		lista.print();

		System.out.println(lista.get(3));
		System.out.println(lista.size());
		
		System.out.println();
		ListaGenerica<Integer> lista2= new MyArrayList<>();
		lista2.addAll(new Integer[]{1,2,3});
		lista2.print();
		
	}
}
