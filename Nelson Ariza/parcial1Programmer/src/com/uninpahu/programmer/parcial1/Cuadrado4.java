package com.uninpahu.programmer.parcial1;

import java.util.Scanner;

public class Cuadrado4 extends Figura4{

	private double ladoCuad;

	@Override
	public void calcularArea() {
		this.area = Math.pow(this.ladoCuad, 2);
	}

	@Override
	public void calcularPerim() {
		this.perim = 4*this.ladoCuad;
	}
	
	public void setLadoCuad(double ladoCuad) {
		this.ladoCuad = ladoCuad;
	}

	@Override
	public void llenarDatos() {
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese el nombre del cuadrado");
		this.nomFigura = in.nextLine();
		System.out.println("Ingrese el lado del cuadro");
		this.ladoCuad = in.nextDouble();
		in.close();
	}

}
