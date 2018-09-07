/*
 baseTria
alturaTria
ladoA, ladoB, ladoC


establecerBaseTria()
establecerAlturaTria()
establecerLadoA()
establecerLadoB()
establecerLadoC()
calcularArea()
calcularPerim()


                      Base x Altura
Area de triángulo = ────────────
                          2
Perímetro de triángulo = Lado A + Lado B + Lado C

 */
package Parcial;


public class Triangulo extends Figura {
    
    //atributos del triangulo
    private double baseTria;
    private double alturaTria;
    private double ladoA, ladoB, ladoC;
    
    //metódos
    Triangulo(){ //constructor
    }
    
public void setpuestablecerBaseTria( double _baseTria)
{
    baseTria = _baseTria;
}
public void setestablecerAlturaTria( double _alturaTria)
{
   alturaTria = _alturaTria;
}
public void setestablecerLadoA(double _ladoA)
{
    ladoA= _ladoA;
}
public void serestablecerLadoB(double _ladoB)
{
    ladoB = _ladoB;
    
}
public void setestablecerLadoC(double _ladoC)
{
    ladoC = _ladoC;
}
  //  aca establecemos el area del triangulo

    @Override
    public double area() {
        
        area = (baseTria*alturaTria)/2;
  
        return area;
    }
  
     //  aca establecemos el perimetro del triangulo
 
    @Override
    public double peri() {
        
        perim = ladoA+ ladoB+ ladoC;
        
        return perim;
    }    
}