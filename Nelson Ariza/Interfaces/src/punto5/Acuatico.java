package punto5;

public class Acuatico extends Transporte {

	public Acuatico(String medio) {
		super(medio);
	}

	@Override
	public void avanzar(String frase) {
		System.out.println("Avanza por agua: "+frase);
	}

	@Override
	public void detener() {
		System.out.println("Se detiene por tierra");
	}

}
