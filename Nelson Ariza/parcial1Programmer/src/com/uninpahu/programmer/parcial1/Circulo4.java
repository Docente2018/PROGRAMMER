package com.uninpahu.programmer.parcial1;

import java.util.Scanner;

public class Circulo4 extends Figura4 implements LlenarDatos {
	
	private double radioCirc;

	@Override
	public void calcularArea() {
		this.area = Math.PI * Math.pow(this.radioCirc, 2);
	}

	@Override
	public void calcularPerim() {
		this.perim = 2 * Math.PI * this.radioCirc;
	}

	public void setRadioCirc(double radioCirc) {
		this.radioCirc = radioCirc;
	}
	
	@Override
	public void llenarDatos() {
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese el nombre del círculo");
		this.nomFigura = in.nextLine();
		System.out.println("Ingrese el radio del círculo");
		this.radioCirc = in.nextDouble();
		in.close();
	}
	
}
