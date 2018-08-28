package punto4;

public class Main {

	public static void main(String[] args) {
		FiguraRegular cuadrado = new Cuadrado(3);
		System.out.println("Area del cuadrado: " + cuadrado.verArea());
		FiguraRegular trianguloEquilatero = new TrianguloEquilatero();
		System.out.println("Area del triángulo: " + trianguloEquilatero.verArea());
	}

}
