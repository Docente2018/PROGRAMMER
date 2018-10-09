/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanoi;

import java.util.Scanner;

/**
 *
 * @author Camilo Arias González
 */
public class Hanoi {
    /**
     * @param args
     * @param Movimientos Torre Hanoi
     */
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.println("Ingrese el número de discos: ");
        int n;
        do {
            //Validamos que sea un número de discos tipo Integer
            while (!input.hasNextInt()) {
                System.out.println("Ingrese un número entero positivo");
                input.next();
            }
            System.out.println("Ingrese un número entero positivo (>0)");
            n = input.nextInt();
        } while (n <= 0);
        
        //Si el número ingresado es válido ejecuta movimientos
        System.out.println("Movimientos: ");
        Movimientos movimientos = new Movimientos();
        movimientos.moverDiscos(n, 'A', 'B', 'C');
    }
}
