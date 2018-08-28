/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulamiento;

/**
 *
 * @author ESTUDIANTE
 */
public class Encapsulamiento {
    
    //Declaro las variables pricadas
    private String Nombre;
    private String Apellido;
    private int Edad;

    //Realizo el encapsulamiento a cada una de las variables
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    public int getEdad() {
        return Edad;
    }
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    //genero el constructor
    public Encapsulamiento(String Nombre, String Apellido, int Edad) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
    }

    //Genero Contructor vacio
    public Encapsulamiento() {
    }
    
    
}
