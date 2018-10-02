
package fibonacci;

import java.util.Scanner;

//creamos una clase fionacci

public class Fibonacci {
    
   
   public static void main(String[] args) {
    
   //metodo para kleer datos por teclado
   Scanner serie = new Scanner(System.in);
   
   //declaramos nuestras variables 
   int num1,num2,naux,limite;
   //intentos que tiene
   int intentosrestantes=3;
   String fin;
   //le damos un valor
   num1=0;
   num2=1;
   
   //solicitamos al usuario ingresar el numero de serie fionacci
   do{
   //intentos maximos
   intentosrestantes--;
   //imprime cuando el valor no es numerico
   System.out.println("Ingrese un valor numerico");
   System.out.println("Ingrese el final");
   fin=serie.nextLine();
   }
   //mientras tenga intentos restantes y no sea un numero valido
   while(intentosrestantes >0 && !Esnumero(fin));
      if(intentosrestantes>0){
     limite=Integer.parseInt(fin);
   //imprimimos un 0 para iniciar la serie
   System.out.println(0);
   
   //El ciclo for para que la variable a comience en 1 que se vaya incrementando segun lña serie fionacci
   
   for(int a=1; a < limite; a++){
   
   //declaramos, numero auxiliar, numero 1 y numero2 , el numero2 sera la suma entre el numero auxiliar y el numero 1 
   naux=num1;
   num1=num2;
   num2=naux+num2;
   
   //aca imprimiremos la respuesta osea el valor que tomara numero 2
   
   System.out.println(num1);
   }
   }
   }
   
   public static boolean Esnumero(String Texto){
       
       try {
           Integer.parseInt(Texto);
           return true;
           
       } catch (Exception e) {
           return false;
       }
   }

        
   
    
    
}
