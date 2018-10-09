/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamientovectores;

import java.util.Scanner;
/**
 *
 * @author ESTUDIANTE
 */
public class OrdenamientoVectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Inicializar variables
        int n, x = 0;
        Scanner input = new Scanner(System.in); 
        System.out.println("Cuantos valores desea organizar: ");
        
        do {
            //Validamos que sea un número de discos tipo Integer
            while (!input.hasNextInt()) {
                System.out.println("Ingrese un número entero positivo");
                input.next();
            }
            n = input.nextInt();
        } while (n <= 0);
        
        int vector[] = new int[n];
        int newVector[] = new int[n];
        
        for(int i=0; i<n; i++){
          vector[i]=(int)(1+Math.random()*1000);
          if(i>0)
              for(int c=0; c <= i-1; c++)
                  if(vector[c]==vector[i])
                    i--;
      }
        
        System.out.println("Oprima 1 para metodo burbuja");
        System.out.println("Oprima 2 para metodo shell");
        System.out.println("Oprima 3 para metodo inserción");
        Ordenamiento ordenar = new Ordenamiento();
         switch (input.nextInt()) {
            case 1: 
                    newVector = ordenar.burbuja(vector);
                    for(x = 0; x<newVector.length; x++ ) {
                        System.out.print(newVector[x]);
                        System.out.print(" - ");
                    }
                     break;
            case 2: 
                    newVector = ordenar.shell(vector);
                    for(x = 0; x<newVector.length; x++ ) {
                        System.out.print(newVector[x]);
                        System.out.print(" - ");
                    }
                     break;
            case 3: 
                    newVector = ordenar.insercion(vector);
                    for(x = 0; x<newVector.length; x++ ) {
                        System.out.print(newVector[x]);
                        System.out.print(" - ");
                    }
                     break;
            default:
                    System.out.println("No es una opción válida");
                    break;
        }
    }
    
}
