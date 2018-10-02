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
    
    public void  Hanoi(int num,int inicio,int temp,int fin){
        if (num == 1)
        {
            System.out.println("Movimiento de la torre de inicio "+inicio+" a la torre de destino" +fin);
        }
        else 
        {
            Hanoi(num -1,inicio,temp,fin);
            System.out.println("Movimiento de la torre de inicio "+inicio+" a la torre de destino" +fin);
            Hanoi(num -1,temp,inicio,fin);
        }
        }
        
}
