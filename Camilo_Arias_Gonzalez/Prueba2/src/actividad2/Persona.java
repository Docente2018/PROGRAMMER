/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad2;
import actividad2.Interfaces.Cantante;
import actividad2.Interfaces.Medida;

/**
 *
 * @author ESTUDIANTE
 */
public class Persona implements Cantante, Medida {
    
    private int peso;
    private String nombre;
    private String apellido;
    
    public Persona(){}
    
    public Persona(int peso, String nombre, String apellido) {
        this.peso = peso;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public int getPeso() {
        return peso;
    }
    
     public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
    @Override
    public void cantar() {
       System.out.println("La laa la raa laaa!");
    }
    
    @Override
    public void pesoLuna() {
        System.out.println("La persona "+this.nombre+ " "+this.apellido+" pesa: " + (this.peso*0.17) + " Kilogramos");
    }
    
}
