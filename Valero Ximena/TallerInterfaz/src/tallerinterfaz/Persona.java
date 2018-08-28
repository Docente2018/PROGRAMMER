/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerinterfaz;

/**
 *
 * @author Ximena
 */
public class Persona implements Cantante{

    private String nombre;
    private int edad;    
        
    @Override
    public void cantar() {
        System.out.println(nombre + " canta ¡La laa la raa laaa!");
    }

    @Override
    public void informacion() {
        System.out.println("El(a) se llama " + nombre + " tiene " + edad + " años.");
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
