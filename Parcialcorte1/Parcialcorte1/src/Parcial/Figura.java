/*

# nomFigura
# area
# perim

establecerNomFigura()
obtenerNomFigura()
*calcularArea()
*calcularPerim()
obtenerArea()
obtenerPerim()
 */
package Parcial;


public abstract class Figura {
    
    //atributos
    //Estos pueden ser usados en la superclase y las subclases
    // ya que estan protegidos 
    protected  String nomFigura;
    protected double area;
    protected double perim;
    
    //metodos
    Figura(){} //constructor 
    
    //metodos abstractos
  public abstract double area();
  public abstract double peri();
  
  
      //setters and getters
     public void setestablecerNomFigura( String _nomFigura)
     {
         nomFigura = _nomFigura;
     }
    public String  getobtenerNomFigura()
    {
     return nomFigura;
    }
    public double getobtenerArea()  
    {
      return area;
    }
    
   public  double getobtenerPerim()
   {
     return perim; 
    }
}
