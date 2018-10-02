/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author jcorremo
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in); //se genera objeto para obtenr valores de la consola
        boolean desicion = true;//se genera variable para controlar el flujo de oportunidades
        int intentos = 0;//se genera variable para almacenar la cantidad de oportunidades
        while (desicion) {
            if (intentos != 3) {//se valida que sean menos solo 3 oportunidades
                System.out.println("Ingrese el numero de parejas a imprimir");
                String entrada = sc.next();
                if (Fibonacci.numerico(entrada)) { // se valida que el valor sea numerico
                    if (Integer.parseInt(entrada) > 0) { // se valida que el numero se a mayor a0
                        Fibonacci.imprimirSerie(Integer.parseInt(entrada)); // se imprime la serie
                        desicion = false;
                    } else {
                        System.out.println("El valor debe ser mayor a 0");
                        intentos ++;
                    }
                } else {
                    System.out.println("El valor no es numerico");
                    intentos++;
                }
            } else {
                System.out.println("Numero de intentos superado");
                desicion = false;
            }
        }
    }

    public static boolean numerico(String cadena) {
        boolean respuesta; //se genera respuesta para el valor numerico
        try {
            Integer.parseInt(cadena);//se genera parse del valor para identifcar si es numerico
            respuesta = true;
        } catch (NumberFormatException ex) {//se caprura la excpecion para determinar que no es numerico
            respuesta = false;
        }
        return respuesta;
    }

    public static void imprimirSerie(int parejas) {
        int uno = 0;
        int dos = 1;
        int tres;
        System.out.println("************************SERIE FIBONACCI ***********");
        System.out.println(uno);//se imprimen lo dos valores estaticos de la serie
        System.out.println(dos);
        for (int i = 0; i < (parejas - 1) * 2; i++) {//se genera la serie a partir de dos veces la cantidad -1 del valor solicitado
            tres = uno + dos;
            uno = dos;
            dos = tres;
            System.out.println(tres);
        }
    }
}
