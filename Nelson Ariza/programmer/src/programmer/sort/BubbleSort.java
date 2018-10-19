package programmer.sort;

import java.util.List;

public class BubbleSort implements Sort {

	public <E extends Comparable<? super E>> List<E> sort(List<E> lista) {
		E aux;
		// Si el arreglo es nulo o tiene 0 elementos termina el método
		// recorre toda la lista y en cada iteración va ordenando un número
		for (int i = 0; i < lista.size() - 1; i++) {
			// recorre los números que aun no se han ordenado
			for (int j = 0; j < lista.size() - 1 - i; j++) {
				// si el elemento de la izquierda es mayor al de la derecha, los intercambia
				if (lista.get(j).compareTo(lista.get(j + 1)) > 0) {
					aux = lista.get(j);
					lista.set(j, lista.get(j + 1));
					lista.set(j + 1, aux);
				}
			}
		}
		return lista;
	}

}
