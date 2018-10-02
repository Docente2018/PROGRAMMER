package com.uninpahu.programmer.parcial1;

public class Figura4Factory {

	public static Figura4 getFigura(byte opcion) {
		switch (opcion) {
		case 1: 
			return new Triangulo4();
		case 2:
			return new Cuadrado4();
		case 3:
			return new Rectangulo4();
		case 4: 
			return new Circulo4();
		default:
			return null;
		}
	}

}
