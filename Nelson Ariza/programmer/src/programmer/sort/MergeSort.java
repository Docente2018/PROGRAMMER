package programmer.sort;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MergeSort implements Sort {
	public <E extends Comparable<? super E>> List<E> sort(List<E> lista) {
		if (lista.size() <= 1)
			return lista;

		int middle = lista.size() / 2;
		List<E> left = lista.subList(0, middle);
		List<E> right = lista.subList(middle, lista.size());

		right = sort(right);
		left = sort(left);
		List<E> result = merge(left, right);

		return result;
	}

	public <E extends Comparable<? super E>> List<E> merge(List<E> left, List<E> right) {
		List<E> result = new ArrayList<E>();
		Iterator<E> it1 = left.iterator();
		Iterator<E> it2 = right.iterator();

		E x = it1.next();
		E y = it2.next();
		while (true) {
			// change the direction of this comparison to change the direction of the sort
			if (x.compareTo(y) <= 0) {
				result.add(x);
				if (it1.hasNext()) {
					x = it1.next();
				} else {
					result.add(y);
					while (it2.hasNext()) {
						result.add(it2.next());
					}
					break;
				}
			} else {
				result.add(y);
				if (it2.hasNext()) {
					y = it2.next();
				} else {
					result.add(x);
					while (it1.hasNext()) {
						result.add(it1.next());
					}
					break;
				}
			}
		}
		return result;
	}
}
