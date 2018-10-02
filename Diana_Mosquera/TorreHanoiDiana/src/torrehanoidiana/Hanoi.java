/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torrehanoidiana;

/**
 *
 * @author Diana
 */
public class Hanoi {
    //declaramos las variables y creamos el ciclo
    public void  Hanoi(int num,int inicio,int temp,int fin){
        if (num == 1)
        {
            System.out.println("Movimiento de la torre de inicio "+inicio+" a la torre de destino" +fin);
        }
        else 
        {
            //jugamos con las posiciones.
            Hanoi(num -1,inicio,fin,temp);
            System.out.println("Movimiento de la torre de inicio "+inicio+" a la torre de destino" +fin);
            Hanoi(num -1,temp,inicio,fin);
        }
        }
        
}
