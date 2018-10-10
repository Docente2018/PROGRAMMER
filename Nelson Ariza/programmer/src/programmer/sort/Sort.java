package programmer.sort;

import java.util.List;

@FunctionalInterface
public interface Sort {

	public <E extends Comparable<? super E>> List<E> sort(List<E> lista);
	
}
