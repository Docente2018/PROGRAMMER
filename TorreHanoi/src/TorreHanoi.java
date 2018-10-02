/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author Ximena
 */
public class TorreHanoi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numDiscos;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite el número de discos ");
        numDiscos = scan.nextInt();
        Hanoi(numDiscos, 1,2,3);
    }

    //Calcula la torre de Hanoi con un numero de discos dados
    public static void Hanoi(int numDiscos, int torre1, int torre2, int torre3) {
        if (numDiscos == 1) {
                System.out.println("Mueva disco de " + torre1 + " a " + torre3);
        }else{
            //Indica las posiciones en las cuales se movera el disco para completar la torre de Hanoi
            Hanoi(numDiscos-1, torre1, torre3, torre2);
            System.out.println("Mueva disco de " + torre1 + " a " + torre3);
            Hanoi(numDiscos-1, torre2, torre1, torre3);
        }
    }
}
