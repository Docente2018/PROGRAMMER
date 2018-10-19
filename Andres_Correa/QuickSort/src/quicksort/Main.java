/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jcorremo
 */
public class Main {

    public static List<Integer> arreglo = new ArrayList();//lista para almacenar los numeros

    public static void main(String[] args) {
        System.out.println("INGRESE LOS NUMEROS DEL ARRELO");
        boolean desicion = true;
        while (desicion) {
            pedirNumero();//se piden numeros hasta que le usuario escriba N
            System.out.println("¿Desea ingresar otro numero? responda Y/N");
            if (!validarDesicion()) {
                desicion = false;
            }
        }
        System.out.println("Arreglo sin acomodar");
        int[] array = new int[arreglo.size()];//se genera un arreglo del tamaño de la lista
        for (int i = 0; i < arreglo.size(); i++) {
            System.out.println(arreglo.get(i) + " - ");
            array[i] = arreglo.get(i);//se van agregando los elementos de la lista al arreglo
        }
        System.out.println();
        System.out.print("Array Ordenado con Burbuja");
        Burbuja.burbuja(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " - ");
        }
        System.out.println("");
        System.out.print("Array Ordenado con Seleccion");
        Seleccion.Seleccion(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " - ");
        }
        System.out.println("");
        System.out.print("Array Ordenado con Shell Sort");
        ShellSort.shellSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " - ");
        }
        System.out.println("");
        System.out.print("Array Ordenado con Insercion");
        Insertion.Insercion(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " - ");
        }
    }

    public static boolean validarDesicion() {//valida la desicion se si pedir o no mas numeros
        boolean retorno = false;
        boolean desicion = true;
        while (desicion) {//la primera es true, ya que se necesiyta minimo un numero
            Scanner sc = new Scanner(System.in);
            String cadena = sc.next();
            if (cadena.toUpperCase().equals("Y") || cadena.toUpperCase().equals("N")) {//se compara si es y o n
                if (cadena.toUpperCase().equals("Y")) {
                    retorno = true;
                    desicion = false;
                } else {
                    retorno = false;
                    desicion = false;
                }
            } else {
                System.out.println("No es un valor valido, recuerde Y/N");
            }
        }
        return retorno;
    }

    public static void pedirNumero() {//metodo para solicitar un numero cada ves
        System.out.println("Escriba el numero");
        Scanner sc = new Scanner(System.in);
        boolean desicion = true;//se establece en true para pedir el primero
        while (desicion) {
            String entrada = sc.next();
            if (validarNumero(entrada)) {//se llama siempre al metodo validar numero
                desicion = false;
                arreglo.add(Integer.parseInt(entrada));//se agrega a la lista de numeros
            }
        }
    }

    public static boolean validarNumero(String valor) { 
    //metodo para validar si es un numero la entrada del usuario
        boolean retornar;
        try {
            Integer.parseInt(valor);//tratamos de hacer parse
            retornar = true;
        } catch (NumberFormatException e) {
            System.out.println("No es un valor numerico");
            retornar = false;
        }
        return retornar;
    }
}
