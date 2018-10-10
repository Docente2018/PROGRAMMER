package programmer.sort;

import java.util.List;

public class ShellSort implements Sort {

	public <E extends Comparable<? super E>> List<E> sort(List<E> lista) {
		// es la distancia entre los elementos a comparar
		int increment = lista.size() / 2;
		while (increment > 0) {
			for (int i = increment; i < lista.size(); i++) {
				int j = i;
				E temp = lista.get(i);
				while (j >= increment && lista.get(j - increment).compareTo(temp) > 0) {
					lista.set(j, lista.get(j - increment));
					j = j - increment;
				}
				lista.set(j, temp);
			}
			if (increment == 2) {
				increment = 1;
			} else {
				increment *= (5.0 / 11);
			}
		}
		return lista;
	}

}
