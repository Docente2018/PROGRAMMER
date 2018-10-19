package programmer.sort;

import java.util.List;

public class QuickSort implements Sort {

	public <E extends Comparable<? super E>> List<E> sort(List<E> lista) {
		return quickSort(lista, 0, lista.size() - 1);
	}

	public <E extends Comparable<? super E>> List<E> quickSort(List<E> lista, int low, int high) {
		// Si el arreglo es nulo o tiene 0 elementos termina el método
		if (lista == null || lista.size() == 0) {
			return lista;
		}
		// Si el límite menor es mayor o igual al límite mayor termina el método
		if (low >= high) {
			return lista;
		}
		// Toma como pivote el valor del elemento del medio entre los límites recibidos
		int middle = low + (high - low) / 2;
		E pivot = lista.get(middle);
		int i = low, j = high;
		// mientras que el límite menor sea menor o igual que el límite superior
		while (i <= j) {
			// busca un elemento de valor superior al pivote
			while (lista.get(i).compareTo(pivot) < 0) {
				i++;
			}
			// busca un elemento de valor inferior al pivote
			while (lista.get(j).compareTo(pivot) > 0) {
				j--;
			}
			// si el elemento de mayor valor se encuentra a la izquierda del otro entonces
			// los intercambia
			if (i <= j) {
				E temp = lista.get(i);
				lista.set(i, lista.get(j));
				lista.set(j, temp);
				i++;
				j--;
			}
		}

		// ordena recursivamente las dos subpartes
		if (low < j) {
			quickSort(lista, low, j);
		}
		if (high > i) {
			quickSort(lista, i, high);
		}
		return lista;
	}

}
