package com.uninpahu.programmer.parcial1;

public abstract class Figura4 implements LlenarDatos {
	
	protected String nomFigura;
	protected double area;
	protected double perim;
	
	public String getNomFigura() {
		return nomFigura;
	}
	
	public void setNomFigura(String nomFigura) {
		this.nomFigura = nomFigura;
	}
	
	protected abstract void calcularArea();
	
	protected abstract void calcularPerim();
	
	public double getArea() {
		calcularArea();
		return area;
	}
	
	public double getPerim() {
		calcularPerim();
		return perim;
	}

}
