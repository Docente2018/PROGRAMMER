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
public class Canario implements Cantante, Medida {
    
    private int peso;
    
    public Canario(){}
    
    public Canario(int peso) {
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    @Override
    public void cantar() {
        System.out.println("Pio Pio Pio");
    }
    
    @Override
    public void pesoLuna() {
        System.out.println("El Canario pesa: " + (this.peso*0.17) + " Libras");
    }

}
