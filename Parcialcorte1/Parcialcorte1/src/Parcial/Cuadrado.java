/*
ladoCuad

establecerLadoCuad()
calcularArea()
calcularPerim()


Area de cuadrado = Lado²
Perímetro de cuadrado = 4 x Lado 

 */
package Parcial;

import static java.lang.Math.pow;

public class Cuadrado extends Figura {
    
    //atributoa del Cuadrado
   private double  ladoCuad;
   
   //metodos
   Cuadrado(){} //contructor
   
   //aca establecemos el valor del lado del cuadrado
  public void  setestablecerLadoCuad(double _ladoCuad)
  {
      ladoCuad = _ladoCuad;
  }
 
  //aca se calcula el area del cuadrado
    @Override
    public double area() {
       
        area = pow(ladoCuad,2);
        
        return area;
    
    }
 //aca se calcula el perimetro del cuadrado
    @Override
    public double peri() {
       perim = 4*ladoCuad;
       return perim;
   }
}
   
   

