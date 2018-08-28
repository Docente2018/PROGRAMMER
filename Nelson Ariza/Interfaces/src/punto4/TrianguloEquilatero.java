package punto4;

public class TrianguloEquilatero extends FiguraRegular {
	
	TrianguloEquilatero() {
		super(3);
	}
	
	@Override
	public double verArea() {
		super.area =  (Math.sqrt(3)* Math.pow(this.longitudLado,2))/4;
		return area;
	}


}
