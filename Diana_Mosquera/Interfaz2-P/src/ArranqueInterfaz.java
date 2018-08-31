
public class ArranqueInterfaz
            {
                     public static void hacerCantar(Cantante c)
	            {
		            c.cantar();
                            
	            }
    
    
	            public static void main(String arg[])
	            {
            		
		            Persona p = new Persona();
		            hacerCantar(p);
                            
                            Canario c = new Canario();
                            hacerCantar(c);

	            }
	            
            }


