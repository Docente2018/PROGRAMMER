
package fibonnaci;


import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Fibonnaci {

    
    public int numero;
    
    public static int  fibonacci(int num){
    
   	if(num==0||num==1)
	{
		return num;
	}
        else
        {
            return (fibonacci(num-1)+fibonacci(num-2));
            
        }
}
    
   
    public static void main(String[] args) throws Exception {
   
      Scanner escribir = new Scanner(System.in);
         int n;
         boolean repetir=false;
        
         
        
         do{
        try
        {  
         repetir=false;   
        System.out.println("digite un numero: ");
        n=escribir.nextInt(); 
            
            for(int i=0;i<=n-1;i++)
          {
          System.err.print(fibonacci(i)+(","));
          }
         if(n<0)
         {
             throw new Exception ("el valor debe ser mayor de cero");
         }
        }
        
        catch(InputMismatchException e)
        {  
          escribir.nextLine();
          n=0;
          System.out.println("Solo se puden digitar numeros "+ e);
          repetir=true;
        }
       catch(Exception e)
        {  
           JOptionPane.showMessageDialog(null, e);
          repetir=true;
        }
       
         }
         
         
         while(repetir);
         
        
    }
    
         
         
    
}
