package com.uninpahu.programmer.parcial1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		byte opcion;
		System.out.println("Seleccione la figura que desea trabajar: \n1). Tri�ngulo\n2). Cuadrado\n3). Rect�ngulo\n4). C�rculo\n");
		opcion = in.nextByte();
		Figura4 figura = Figura4Factory.getFigura(opcion);
		figura.llenarDatos();
		System.out.println("El �rea del "+figura.getClass().getSimpleName()+" con nombre "+figura.getNomFigura()+" es: "+figura.getArea());
		System.out.println("El per�metro del "+figura.getClass().getSimpleName()+" con nombre "+figura.getNomFigura()+" es: "+figura.getPerim());		
	}

}
