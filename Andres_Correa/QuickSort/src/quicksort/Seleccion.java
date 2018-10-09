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
public class Seleccion {

    public static void Seleccion(int[] matrix) {
        int i, j, k, p, buffer, limit = matrix.length - 1;
        for (k = 0; k < limit; k++) {//se recorre la lista
            p = k;
            for (i = k + 1; i <= limit; i++) {//se recorre siempre que el nuevo item sea igual al elemento siguiente y menor al tamaño
                if (matrix[i] < matrix[p]) {//se compara si es menor
                    p = i;//se cambian los valores
                }
                if (p != k) {
                    buffer = matrix[p];
                    matrix[p] = matrix[k];
                    matrix[k] = buffer;
                }
            }
        }
    }
}
