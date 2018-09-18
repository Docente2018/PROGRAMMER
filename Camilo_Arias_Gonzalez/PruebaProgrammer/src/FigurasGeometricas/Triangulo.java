/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FigurasGeometricas;


/**
 *
 * @author ESTUDIANTE
 */
public class Triangulo extends Figura {
    private int baseTria;
    private int alturaTria;
    private int ladoA, ladoB, ladoC;
    
    public Triangulo(int baseTria, int alturaTria, int ladoA, int ladoB, int ladoC) {
        this.baseTria = baseTria;
        this.alturaTria = alturaTria;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public Triangulo() {        
    }

    public int getBaseTria() {
        return baseTria;
    }

    public int getAlturaTria() {
        return alturaTria;
    }

    public int getLadoA() {
        return ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public int getLadoC() {
        return ladoC;
    }
    
 
    
}
