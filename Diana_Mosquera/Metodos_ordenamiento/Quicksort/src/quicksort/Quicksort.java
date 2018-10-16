/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Diana
 */
public class Quicksort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Ingrese cantidad de elementos: ");
       int n=sc.nextInt();
       int []v=new int [n];
       generar(v);
       mostrar(v);
       System.out.println("Elementos ordenados: ");
       
       quick(0,(v.length - 1), v);
       mostrar(v);
       
    }
    //se genero metodo constructor 
    private static void generar(int[] v) {
         Random r = new Random();
    for(int i= 0; i < v.length; i++){
        v[i]=r.nextInt(20);
    }
    }
    //se genero metodo constructor 
    private static void mostrar(int[] v) {
      System.out.println(); 
      for(int i= 0; i < v.length; i++){
      System.out.println(v [i]+"\t"); 
      
      }
      
       System.out.println();  
       
    }

    private static void quick(int primero, int ultimo, int[] v) {
        int i=primero;
        int j=ultimo;
        int central = v [(primero+ultimo)/2];
        
        do {
            while(central>v[i]){
              i++;
            }    
            
             while(central < v[j]){
              j--;
            }  
             
        if (i<=j){
   //intercambio de valores para poder ordenar           
        int temp = v[i];  
        v[i]=v[j];
        v[j]=temp;
        i++;
        j--;
              } 
             
            
        } while (i<=j);
        
        if (primero < j ){
        quick(primero, j, v);
        }
        if (ultimo > i ){
        quick(i, ultimo, v);
        }
        
    }
    
}
