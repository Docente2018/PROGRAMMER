/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author Diego Aristizabal
 */
public class Fibonacci {

    // Metodo para validar si es dato es numerico o String
    public static boolean isNumeric(String cadena) {
        boolean resultado;
        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }
        return resultado;
    }

    public static void main(String[] args) {

        // variables con las cuales se va ejecutar el codigo y las respectivas validaciones
        int n1 = 0;
        int n2 = 1;
        int aux;
        String NumIteraciones;
        int NumeroI;

        //Se crea un ciclo para que el usuario tenga 3 oportunidades
        for (int q = 0; q < 3; q++) {

            System.out.println("Ingrese el numero de iteraciones de la serie de fibonacci");

            // Se crea la instancia de Scanner para capturar el dato ingresado pot el usuario
            Scanner Entrada = new Scanner(System.in);
            NumIteraciones = Entrada.nextLine();

            try {

                //La variable en la cual se almacena el dato para la cantidad de iteracciones se crea inicialmente 
                // en string para realizar la validacion cuando el usuario digita alguna letra
                NumeroI = Integer.parseInt(NumIteraciones);

                // Se crea la primer validacion donde valida si el numero digitado es menor que 1
                if (NumeroI < 1) {

                    System.out.println("digite un numero mayor a 1 porfavor !!");

                    // Se crea la validacion para determinar si el valor ingresado es texto o es un numero valido
                    // para continuar con el proceso y clacular la serie de fibonacci
                } else if (isNumeric(NumIteraciones) == true) {

                    System.out.println("La serie de fibonacci con " + NumIteraciones + " iteraciones es la siguiente: ");

                    System.out.println(n1);
                    System.out.println(n2);

                    // Se realiza el calculo de la serie de fibonacci solicitada por el ususario              
                    NumeroI = NumeroI - 2;
                    for (int i = 0; i < NumeroI; i++) {
                        aux = n1;
                        n1 = n2;
                        n2 = aux + n1;

                        System.out.println(n2);
                    }
                }
            } catch (Exception e) {
                System.out.println("Ha Digitado una letra...");
                System.out.println("Digite un Numero Porfavor !!");

            }
        }
    }

}
