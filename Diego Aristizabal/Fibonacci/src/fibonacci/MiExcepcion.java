/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author ESTUDIANTE
 */
public class MiExcepcion extends Exception {
    // Constructor
    public MiExcepcion(String s){
    super( s );
    }
    
    // Excepcion: Error Provocado
    public String excErrorPersonalizado(){
        return "Error provocado.";
    }
}

