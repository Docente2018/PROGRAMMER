
package Practicas2;

import java.util.Scanner;


public class ArranqueInterfaz {
    
    public static void main( String[]args)
    {
        

        Persona p = new Persona();
        
        hacerCantar(p);
        
        p.setNombre("jorge");
        p.setEdad(80);
        
       personacantando(p);
        
        Canario c= new Canario();
       
        c.setcolor("verde");
        c.setnombre("Margarot");
        c.volar();
        hacerCantar(c);
        
         
    }
    
   public static void hacerCantar(Cantante c)
   {
       c.cantar();
   }
   
   public static void personacantando(Cantante p)
   {
       p.cantar();
   }
    
}
