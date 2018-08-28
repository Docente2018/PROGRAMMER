package interfaces;

public class Main {

	public static void main(String[] args) {
		Persona p = new Persona();
		Canario c = new Canario();
		hacerCantar(p);
		hacerCantar(c);
	}
	
	public static void hacerCantar(Cantante c) {
		c.cantar();
	}

}
