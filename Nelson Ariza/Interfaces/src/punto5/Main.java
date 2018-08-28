package punto5;

public class Main {

	public static void main(String[] args) {
		Transporte carro = new Terrestre(" en Carro");
		Transporte barco = new Acuatico(" en barco");
		carro.avanzar("carro");
		carro.giraDerecha();
		carro.girarIzquierda();
		carro.detener();
		barco.avanzar("barco");
		barco.giraDerecha();
		barco.girarIzquierda();
		barco.detener();
	}

}
