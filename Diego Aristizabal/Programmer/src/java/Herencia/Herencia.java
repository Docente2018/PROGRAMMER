package Herencia;

import Encapsulamiento.Encapsulamiento;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ESTUDIANTE
 */

// Creo la clase herencia y heredo la clase encapsulamiento
public class Herencia extends Encapsulamiento {
    
    // Genero las variables propias de la clase padre (Herencia)
    public int Grupo;
    public String Carrera;
    
    public Herencia(){
             super();
    }
    
    //Creo el metodo con las variables heredadas y las porpias de la clase
    public Herencia (int Edad, String Nombre, String Apellido, int Grupo, String Carrera ){
        super(Nombre, Apellido, Edad);
		this.Grupo = Grupo;
		this.Carrera = Carrera;
        
    }
    
}
