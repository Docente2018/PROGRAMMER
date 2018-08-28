package punto5;

public class Terrestre extends Transporte {

	public Terrestre(String medio) {
		super(medio);
	}

	@Override
	public void avanzar(String frase) {
		System.out.println("Avanza por tierra: "+frase);
	}

	@Override
	public void detener() {
		System.out.println("Se detiene por tierra");
	}

}
