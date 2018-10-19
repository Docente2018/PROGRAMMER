/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hannoi;

import java.util.Scanner;

/**
 *
 * @author jcorremo
 */
public class Hannoi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese el numero de discos");
        Scanner sc = new Scanner(System.in);
        hanoi(sc.nextInt(), 1, 3, 2);
        
    }
    
    public static void hanoi(int ring, int towerOrigin, int towerDestination, int towerAux){
        if(ring == 1){
            System.out.println("Mover anillo de "+ towerOrigin + " Hacia "+towerDestination);
        }else{
            hanoi(ring-1, towerOrigin, towerAux,towerDestination);
            System.out.println("Mover anillo de "+ towerOrigin + " Hacia "+towerDestination);
            hanoi(ring-1, towerAux, towerDestination, towerOrigin);
        }
    }
}
