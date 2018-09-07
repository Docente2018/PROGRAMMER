/*
radioCirc

establecerRadioCirc()
calcularArea()
calcularPerim()

Area de círculo = πr²
Perímetro de círculo = 2πr
 */


package Parcial;

import static java.lang.Math.pow;


public class Circulo extends Figura {
    
    
    //atributos del circulo
    private double radioCirc;
    
    //metodos
    
    Circulo(){} //constructor
    
     public void setestablecerRadioCirc(double _radioCirc)
     {
         radioCirc= _radioCirc;  
     }

    @Override
    public double area() {
        area = Math.PI*(pow(radioCirc,2));
        return area;
    }

    @Override
    public double peri() {
        perim= 2*Math.PI*radioCirc;
        return perim;
    }
    
     
     
}
