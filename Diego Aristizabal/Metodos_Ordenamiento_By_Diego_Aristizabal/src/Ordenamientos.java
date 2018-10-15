/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diego Aristizabal
 * @see Uninpahu
 */
import java.util.Random;

public class Ordenamientos {

    int[] numeros;

    Ordenamientos(int n) {
        generarNumerosAleatorios(n);
    }

    //Metodo para generar numeros aleatorios
    public void generarNumerosAleatorios(int n) {
        Random sig = new Random();
        int i;

        numeros = new int[n];
        for (i = 0; i < n; ++i) {
            numeros[i] = sig.nextInt(1000);
        }
    }

    public int[] getNumeros() {
        return numeros;
    }

    public void copiar(int[] origen, int[] destino) {
        int i;
        for (i = 0; i < origen.length; ++i) {
            destino[i] = origen[i];
        }
    }
    
    //metodo de ordenamiento BURBUJA
    public int[] Burbuja() {
        int n = numeros.length;
        int[] arreglo = new int[n];
        int i, j, aux;

        copiar(numeros, arreglo);

        for (i = 0; i < n; ++i) {
            for (j = 0; j < n - 1; ++j) {
                if (arreglo[j] > arreglo[j + 1]) {
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }
        return arreglo;
    }

    // metodo de ordenamiento BURBUJA MEJORADA
    public int[] BurbujaMejorada() {
        int n = numeros.length;
        int[] arreglo = new int[n];
        int aux, i, j;
        boolean hizo_intercambio = true;

        copiar(numeros, arreglo);

        for (i = 0; i < n && hizo_intercambio; ++i) {
            hizo_intercambio = false;
            for (j = 0; j < n - i - 1; ++j) {
                if (arreglo[j] > arreglo[j + 1]) {
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                    hizo_intercambio = true;
                }
            }
        }
        return arreglo;
    }

    //metodo de ordenamiento  INSERCIÓN    
    public int[] Insercion() {
        int n = numeros.length;
        int[] arreglo = new int[n];
        int aux, i, j, n_arreglo = 0;

        for (i = 0; i < n; ++i) {
            //Buscar la posición donde insertar
            for (j = 0; j < n_arreglo; ++j) {
                if (arreglo[j] > numeros[i]) {
                    break;
                }
            }

            //Llevar a cabo el corrimiento.
            arreglo[n_arreglo] = numeros[i];

            while (j < n_arreglo) {
                aux = arreglo[j];
                arreglo[j] = arreglo[n_arreglo];
                arreglo[n_arreglo] = aux;
                ++j;
            }
            ++n_arreglo;
        }
        return arreglo;
    }

    //metodo de ordenamiento  SELECCIÓN
    public int[] Seleccion() {
        int n = numeros.length;
        int[] arreglo = new int[n];
        int aux, i, j, mayor;

        copiar(numeros, arreglo);

        for (i = 0; i < n; ++i) {
            //Buscar el mayor
            mayor = 0;
            for (j = 1; j < n - i; ++j) {
                if (arreglo[j] > arreglo[mayor]) {
                    mayor = j;
                }
            }
            //Intercambiarlo con la ultima posición (correspondiente).
            aux = arreglo[mayor];
            arreglo[mayor] = arreglo[n - i - 1];
            arreglo[n - i - 1] = aux;
        }
        return arreglo;
    }

    //metodo de ordenamiento  SHELL
    public int[] Shell() {
        int n = numeros.length;
        int[] arreglo = new int[n];
        int aux, i, j, k, l;

        copiar(numeros, arreglo);

        //Bucle principal de control, mienstras k >= 1.
        k = n / 2;

        while (k >= 1) {
            //Ordenar cada uno de los subgrupos creados, por saltos de k.
            for (l = 0; l < k; ++l) {
                for (i = 0; i < n; i += k) {
                    //Usar una version modificada del algoritmo de inserción.                
                    j = i;

                    while (j - k >= 0 && arreglo[j - k] > arreglo[j]) {
                        aux = arreglo[j];
                        arreglo[j] = arreglo[j - k];
                        arreglo[j - k] = aux;
                        j = j - k;
                    }
                }
            }
            //Asignar nuevo valor de k.
            k = k / 2;
        }
        return arreglo;
    }

    //metodo de ordenamiento  Inserción Binaria
    public int[] InsercionBinaria() {
        int n = numeros.length;
        int[] arreglo = new int[n];
        int aux, i, l, r, m, n_arreglo = 1;

        copiar(numeros, arreglo);

        for (i = 1; i < n; ++i) {
            l = 0;
            r = n_arreglo - 1;
            while (l <= r) {
                m = (l + r) / 2;
                if (numeros[i] > arreglo[m]) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }
            while (l < n_arreglo) {
                aux = arreglo[l];
                arreglo[l] = arreglo[n_arreglo];
                arreglo[n_arreglo] = aux;
                ++l;
            }
            ++n_arreglo;
        }
        return arreglo;
    }

}
