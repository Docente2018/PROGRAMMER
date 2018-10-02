package com.uninpahu.programmer.parcial1;

import java.util.Scanner;

public class Triangulo4 extends Figura4 {
	
	private double baseTria;
	private double alturaTria;
	private double ladoA;
	private double ladoB;
	private double ladoC;

	@Override
	public void calcularArea() {
		this.area = (this.baseTria * this.alturaTria)/2;
	}

	@Override
	public void calcularPerim() {
		this.perim = this.ladoA + this.ladoB + this.ladoC;
	}

	public void setBaseTria(double baseTria) {
		this.baseTria = baseTria;
	}

	public void setAlturaTria(double alturaTria) {
		this.alturaTria = alturaTria;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}

	public void setLadoC(double ladoC) {
		this.ladoC = ladoC;
	}
	
	@Override
	public void llenarDatos() {
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese el nombre del triángulo");
		this.nomFigura = in.nextLine();
		System.out.println("Ingrese la base del triángulo");
		this.baseTria = in.nextDouble();
		System.out.println("Ingrese la altura del triángulo");
		this.alturaTria = in.nextDouble();
		System.out.println("Ingrese el lado A del triángulo");
		this.ladoA = in.nextDouble();
		System.out.println("Ingrese el lado B del triángulo");
		this.ladoB = in.nextDouble();
		System.out.println("Ingrese el lado C del triángulo");
		this.ladoC = in.nextDouble();
		in.close();
	}
	
}
