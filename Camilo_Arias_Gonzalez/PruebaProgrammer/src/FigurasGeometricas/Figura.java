/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FigurasGeometricas;

import Interfaces.Calculos;

/**
 *
 * @author ESTUDIANTE
 */
public class Figura implements Calculos {
    private String nomFigura;
    private float area;
    private float perimetro;

    public Figura() {
    }

    public void setNomFigura(String nomFigura) {
        this.nomFigura = nomFigura;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }
    
    public String getNomFigura() {
        return nomFigura;
    }

    public float getArea() {
        return area;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public String obtenerNomFigura() {
        switch(Integer.parseInt(this.getNomFigura())){
            case(1):
                this.nomFigura = "Triangulo";
                break;
            case(2):
                this.nomFigura = "Cuadrado";
                break;
            case(3):
                this.nomFigura = "Rectangulo";
                break;
            case(4):
                this.nomFigura = "Circulo";
                break;
            default:
                this.nomFigura = "Error"; 
                break;
        }
        return this.getNomFigura();
    }

    @Override
    public void calcularArea() {
    }

}
