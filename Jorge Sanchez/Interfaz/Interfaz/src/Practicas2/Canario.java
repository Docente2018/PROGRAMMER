
package Practicas2;


public class Canario implements Cantante{
    
    private int peso;
    private String color;
    private String nombre;
    

    public void setcolor( String _color)
    {
        color = _color;
    }
    public String getcolor()
    {
        return color;
    }
   
    public void setnombre( String _nombre)
            
    {
        nombre = _nombre;
    }
   
    public String getnombre()
    {
        return nombre;
    }
   
    public void cantar() {
        System.out.println("el canario de color "+ color + " hace Pio Pio Pio");
    }
    
    public void volar()
    {
        System.out.println("el canario "+nombre +" vuelta mas alto que otros canarios");
    }

    @Override
    public String escuchar() {
         String frase;
         frase ="se escuha su canto entre los arboles";
         
         return frase;
    }
    
}
