/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementacion;

/**
 *
 * @author ESTUDIANTE
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Compra c= new Compra(100000);
        System.out.println(c.descuento(new DescuentoTienda()));
 


    }
    
}
