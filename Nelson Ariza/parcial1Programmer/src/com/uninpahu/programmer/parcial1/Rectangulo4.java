package com.uninpahu.programmer.parcial1;

import java.util.Scanner;

public class Rectangulo4 extends Figura4 {

	private double baseRecta;
	private double alturaRecta;
	
	@Override
	public void calcularArea() {
		this.area = this.baseRecta * this.alturaRecta;
	}

	@Override
	public void calcularPerim() {
		this.perim = 2 * (this.baseRecta + this.alturaRecta);
	}

	public void setBaseRecta(double baseRecta) {
		this.baseRecta = baseRecta;
	}

	public void setAlturaRecta(double alturaRecta) {
		this.alturaRecta = alturaRecta;
	}
	
	@Override
	public void llenarDatos() {
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese el nombre del rectángulo");
		this.nomFigura = in.nextLine();
		System.out.println("Ingrese la base del rectángulo");
		this.baseRecta = in.nextDouble();
		System.out.println("Ingrese la altura del rectángulo");
		this.alturaRecta = in.nextDouble();
		in.close();
	}

}
