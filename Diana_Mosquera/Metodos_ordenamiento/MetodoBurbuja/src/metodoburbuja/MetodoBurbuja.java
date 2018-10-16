/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoburbuja;

/**
 *
 * @author Diana
 */
public class MetodoBurbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ingresamos la variables 
        
        int b []={10,47,23,16,48};
        burbuja(b);
        Mostrar(b);
    }
    public static void burbuja(int b[]){
        for (int i = 0; i < b.length; i++) {
          for (int j = 0; j < b.length-1; j++){
            if (b[j]>b[j+1]){
               int aux = b[j];
              b[j]=b[j+1];
              b[j+1]=aux;
              
            }
          
          }
            
        }
    }
    
    public static void Mostrar(int b[]){
        for (int i = 0; i < b.length; i++) {
         System.out.print(b[i]+"\n");
        }
         System.out.print("");
    }
}
