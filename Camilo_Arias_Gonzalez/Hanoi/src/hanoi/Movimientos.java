/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanoi;

/**
 * Clase Movimientos
 * @author ESTUDIANTE
 */
public class Movimientos {
    
    /**
     * Carga los movimientos según el número de discos asignados
     * @param x
     * @param desde
     * @param hasta
     * @param aux
    **/
    public void moverDiscos(int x, char desde, char hasta, char aux) {        
        if(x == 1) {            
            System.out.println("Mover el disco " + x + " desde " + desde + " a "
            + hasta);
        } else {
            moverDiscos(x - 1, desde, aux, hasta);           
            System.out.println("Mover el disco " + x + " desde " + desde + " a " 
            + hasta);
            moverDiscos(x - 1, aux, hasta, desde);
        }
    }
}
