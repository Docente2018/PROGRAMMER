/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamientovectores;

/**
 *
 * @author Camilo Arias González
 */
public class Ordenamiento {
        //Metodo Burbuja
	public int[] burbuja (int[] arreglo) {
            // Declaración inicial de variables para iterar.
            int i, j, aux;
            // Ordenamos el array de enteros.
            for (i = 0; i < arreglo.length - 1; i++) {
                //Recorremos el arreglo
                for (j = 0; j < arreglo.length - i - 1; j++) {
                    //Validamos si el número siguiente es mayor
                    if (arreglo[j + 1] < arreglo[j]) {
                        aux = arreglo[j + 1];
                        arreglo[j + 1] = arreglo[j];
                        arreglo[j] = aux;
                    }
                 }
            }
            /* Retornamos el array de enteros ordenado de forma ascendente. */
            return arreglo;
	}
        
        //Metodo Shell
        public int[] shell(int[] arreglo){
            // Declaración inicial de variables para iterar.
            int valor, i, aux;
            boolean validar;
            //Guardamos la cantidad de indices
            valor = arreglo.length;
            //Mientras el valor sea mayor a 0
            while(valor > 0){
                valor = valor / 2;
                //Dividimos la cantidad total en 2 y validamos
                validar = true;
                while(validar){
                    validar = false;
                    i = 0;
                    //Mientras el indice mas el valor sea menor o igual a la cantidad menos 1 validamos
                    while ((i+valor) <=arreglo.length-1){
                        //Si el valor de la posicion actual es mayor al de la siguiente guardamos en auxiliar
                        if (arreglo[i] > arreglo[i + valor]){
                            aux = arreglo[i];
                            arreglo[i] = arreglo[i+valor];
                            arreglo[i+valor] = aux;
                            validar = true;
                        }
                        i = i +1;
                    }
                }
            }
            /* Retornamos el array de enteros ordenado de forma ascendente. */
            return arreglo;
	}
 
        //Metodo insercion
        public int[] insercion(int arreglo[]){
            // Declaración inicial de variables para iterar.
            int p, j;
            int aux;
            //Iteramos desde el segundo indice del array
            for (p = 1; p < arreglo.length; p++){ 
                //Guardamos en valor en el auxiliar
                aux = arreglo[p]; 
                //Valido con el valor del indice anterior
                j = p - 1;
                //Validamos si el valor de auxiliar es menor al de la izquiera
                while ((j >= 0) && (aux < arreglo[j])){ 
                    arreglo[j + 1] = arreglo[j];
                    j--;
                }
                arreglo[j + 1] = aux; // colocamos aux en su sitio
            }
            return arreglo;
        }
}
