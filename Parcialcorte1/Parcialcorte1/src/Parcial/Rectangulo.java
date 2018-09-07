/*
baseRecta
alturaRecta

establecerBaseRecta()
establecerAlturaRecta()
calcularArea()
calcularPerim()

Area de rectángulo = Base x Altura
Perímetro de rectángulo = 2(Base + Altura)


 */
package Parcial;


public class Rectangulo extends Figura {
    
    //atributos del rectangulo
    
    private double baseRecta;
    private double alturaRecta;
    
    //metodos
    Rectangulo(){} //constructor 
    
    
    //aca establecemos los valores de los atributos del rectangulo
    public void setestablecerBaseRecta( double _baseRecta)
         {
         baseRecta = _baseRecta;
         }
    public void setestablecerAlturaRecta( double _alturaRecta)
    {
     alturaRecta = _alturaRecta;
    }

    
    //aca calculamos el area y perimetro del rectangulo
    @Override
    public double area() {
       area =baseRecta*alturaRecta;
       
       return area;
    }

    @Override
    public double peri() {
        perim=  2*(baseRecta+alturaRecta);
        return perim;
    }


    
    
}
