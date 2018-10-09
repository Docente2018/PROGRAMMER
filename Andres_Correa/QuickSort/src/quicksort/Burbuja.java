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
public class Burbuja {

    public static void burbuja(int[] matrix) {
        int temp;//se genera para almacenar un valor temporal para replazar
        for (int i = 1; i < matrix.length; i++) {//se recorre la lista para sacar el primer elemento
            for (int j = 0; j < matrix.length - 1; j++) {//por cada uno de esos elementos se recorre nuevamente la lista
                if (matrix[j] > matrix[j + 1]) {//se compara si el elemento de la segunda lista es mayor al elemento siguiente
                    temp = matrix[j];//se obtiene el valor en ejecucion
                    matrix[j] = matrix[j + 1];//se remplaza por el calor siguiente
                    matrix[j + 1] = temp;
                }
            }
        }
    }
    
}
