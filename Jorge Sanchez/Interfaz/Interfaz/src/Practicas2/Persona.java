
package Practicas2;


public class Persona implements Cantante{
    
   
  private String nombre;
  private int edad;

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
  
  
  
    @Override
    public void cantar() {
        System.out.println("a "+nombre+" le gusta cantar asi la laa la raa laa!");
    }

    @Override
    public String escuchar() {
       
       String frace;
       frace = "escucho su canto";
       return frace;
       
    }

   
    
}
