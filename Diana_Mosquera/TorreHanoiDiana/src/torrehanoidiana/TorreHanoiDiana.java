/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torrehanoidiana;

import java.util.Scanner;

/**
 *
 * @author Diana
 */
public class TorreHanoiDiana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //inicie desde cero 
        int n=0;
        Scanner leer = new Scanner (System.in);
        Hanoi h = new Hanoi();
       //ingrese el numero de discos en el juego 
        System.out.println("Ingrese el numero de aros");
        //lea en orden 
        
       n = leer.nextInt();
        h.Hanoi(n,1,2,3);
    }
    
}
