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
public class Ejecutar {
    
    public static void main(String arg[]){
        
        Implementacion Imp = new Implementacion() {};
        Imprimir(Imp);
    }
        public static void Imprimir(Interface I){
            I.Ejemplo();
        }
        
    }
    

