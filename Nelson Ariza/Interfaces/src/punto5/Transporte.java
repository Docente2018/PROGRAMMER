package punto5;

public abstract class Transporte {
	
	public String medio;
	
	public Transporte(String medio) {
		super();
		this.medio = medio;
	}

	public void giraDerecha() {
		System.out.println("Gira a la derecha");
	}
	
	public void girarIzquierda() {
		System.out.println("Gira a la izquierda");
	}
	
	public abstract void avanzar(String frase);
	
	public abstract void detener();

}
