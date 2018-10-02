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
		System.out.println("Ingrese el nombre del tri�ngulo");
		this.nomFigura = in.nextLine();
		System.out.println("Ingrese la base del tri�ngulo");
		this.baseTria = in.nextDouble();
		System.out.println("Ingrese la altura del tri�ngulo");
		this.alturaTria = in.nextDouble();
		System.out.println("Ingrese el lado A del tri�ngulo");
		this.ladoA = in.nextDouble();
		System.out.println("Ingrese el lado B del tri�ngulo");
		this.ladoB = in.nextDouble();
		System.out.println("Ingrese el lado C del tri�ngulo");
		this.ladoC = in.nextDouble();
		in.close();
	}
	
}
