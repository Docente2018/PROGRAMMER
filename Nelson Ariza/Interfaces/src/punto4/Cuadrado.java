package punto4;

public class Cuadrado extends FiguraRegular {
	
	public Cuadrado() {
		super(4);
	}
	
	public Cuadrado(double longitudLado) {
		super(4,longitudLado);
		
	}
	
	@Override
	public double verArea() {
		super.area = this.longitudLado*this.longitudLado;
		return area;
	}

}
