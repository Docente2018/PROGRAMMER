/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerinterfaz;

/**
 *
 * @author Ximena
 */
public class ArranqueInterfaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p = new Persona();
        p.setNombre("Pepe");
        p.setEdad(21);
        hacerCantar(p);
        
        Canario c = new Canario();
        c.setColor("azul");
        c.setNombre("Marti");
        c.setPeso(1);
        hacerCantar(c);
    }

    public static void hacerCantar(Cantante c) {
        c.informacion();
        c.cantar();
    }

}
