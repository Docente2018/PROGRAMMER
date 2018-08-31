/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas2uninpahu;

/**
 *
 * @author ESTUDIANTE
 */
public class ArranqueInterfaz {
    
    public static void main(String arg[])
	            {
            		
                        
		            Persona P = new Persona();
		            hacerCantar(P);
                            
                            Canario canario = new Canario();
                            hacerCantar(canario);
                            
                            
	            }
	            public static void hacerCantar(Cantante c)
	            {
		            c.cantar();
                            
                            
	            }

                    
                    
                   
                    
}
