/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

/**
 *
 * @author jcorremo
 */
public class Insertion {

    public static void Insercion(int[] vector) {
        for (int i = 1; i < vector.length; i++) {//se recorre la lista original
            int aux = vector[i];//se almacena por cada iteracion el valor temporal
            int j;
            for (j = i - 1; j >= 0 && vector[j] > aux; j--) {//se recorre siempre que sea un numero mayor a 0 y mayor al elemento de la iteracion
                vector[j + 1] = vector[j];//se cambia el valor
            }
            vector[j + 1] = aux;//se cambia por el auxiliar
        }
    }
}
