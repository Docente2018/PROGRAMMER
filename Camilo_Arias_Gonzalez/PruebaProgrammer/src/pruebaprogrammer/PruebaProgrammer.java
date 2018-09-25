/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaprogrammer;

import FigurasGeometricas.Figura;
import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class PruebaProgrammer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("BIENVENIDO ÁREAS Y PERIMETROS DE FIGURAS GEOMETRICAS");
        System.out.println("SELECCIONE UNA OPCIÓN");
        System.out.println("PRESIONE (1) TRIANGULO");
        System.out.println("PRESIONE (2) CUADRADO");
        System.out.println("PRESIONE (3) RECTANGULO");
        System.out.println("PRESIONE (4) CIRCULO");
        System.out.println("PRESIONE (5) FIN");      
        Scanner scanner = new Scanner(System. in); 
        String option = scanner. nextLine();
        Figura figura = new Figura();
        figura.setNomFigura(option);
        if(!"error".equals(figura.obtenerNomFigura())){
            System.out.println("PRESIONE (1) ÁREA");
            System.out.println("PRESIONE (2) PERIMETRO");
            String option2 = scanner. nextLine();
            if( parseInt(option2) == 1){
                figura.calcularArea();
            }else if( parseInt(option2) == 2){
            
            }else{
                System.out.println("No es una opción válida");
            }
        }
    }
    
}
