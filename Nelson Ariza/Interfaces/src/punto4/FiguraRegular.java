package punto4;

public class FiguraRegular {
	
	public double lado;
	public double longitudLado;
	protected double area;
	
	FiguraRegular(){
		this.lado = 3;
		this.area = 0;
		this.longitudLado = 1;
	}
	
	FiguraRegular(double lado){
		this();
		this.lado = lado;
	}
	
	FiguraRegular(double lado, double longitudLado){
		this(lado);
		this.longitudLado = longitudLado;
	}

	public double verArea() {
		return area;
	}


}
