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
public class Rectangulo extends Figura {
    private int baseRecta;
    private int alturaRecta;

    public Rectangulo(int baseRecta, int alturaRecta) {
        this.baseRecta = baseRecta;
        this.alturaRecta = alturaRecta;
    }
    
    public Rectangulo() {
    }
    
    public int getBaseRecta() {
        return baseRecta;
    }

    public int getAlturaRecta() {
        return alturaRecta;
    }
}
