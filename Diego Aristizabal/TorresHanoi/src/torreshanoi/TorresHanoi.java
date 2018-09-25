/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torreshanoi;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class TorresHanoi {

    static Scanner entrada = new Scanner(System.in);

    //Método Torres de Hanoi Recursivo
    static void TorresHanoi(int n, int origen, int destino, int auxiliar) {

        if (n > origen) {
            TorresHanoi(n - 1, origen, auxiliar, destino);
            System.out.println("\n Se mueve el plato desde torre " + origen + " hasta torre " + destino + "");
            TorresHanoi(n - 1, auxiliar, destino, origen);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejecución del metodo y digitacion de la cantidad de Platos

        int n;
        System.out.println("Ingresar cantidad de platos: ");
        n = entrada.nextInt();
        TorresHanoi(n, 1, 3, 2);

    }

}
