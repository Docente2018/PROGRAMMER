package punto3;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Animal> listaAnimales= new ArrayList<>();
		listaAnimales.add(new Leon());
		listaAnimales.add(new Tigre());
		for (Animal animal : listaAnimales) {
			animal.rugir();
		}
	}

}
