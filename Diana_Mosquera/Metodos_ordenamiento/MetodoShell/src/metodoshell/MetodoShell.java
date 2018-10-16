/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoshell;
import java.util.Scanner;

/**
 *
 * @author Diana
 */
public class MetodoShell {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner valor = new Scanner (System.in);
       System.out.println("Ingrese cantidas de elementos");
       int p = valor.nextInt();
       int [] a = new int [p];
       System.out.println("Ingrese los valores del arreglo");
       for (int i=0;i<p;i++){
       a[i] = valor.nextInt();
       
       }
       System.out.println("..........Salida de datos..........");
       ShellSort(a);
       for (int i=0; i<p;i++){
       System.out.println(+a[i]);
       
       }
    }
    public static void ShellSort(int[]matrix){
    for(int increment = matrix.length/2; increment > 0; increment = (increment == 2)? 1: (int)Math.round(increment/2.2) ){
     for (int i = increment; i < matrix.length; i++){
       for (int j=i;j>= increment && matrix [j - increment]
               > matrix [j]; j -= increment){
           int temp = matrix[j]; 
           matrix[j]=matrix[j-increment];
           matrix [j-increment]=temp;
       }
     
     }
    
    }
        
    }
}
