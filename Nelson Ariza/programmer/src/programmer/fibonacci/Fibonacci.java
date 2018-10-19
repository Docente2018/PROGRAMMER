package programmer.fibonacci;

import java.util.Scanner;

public class Fibonacci {
    
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int intentosRestantes = 3;
        String dato = "47";
        do {
            intentosRestantes--;
            System.out.println("Ingrese el la cantidad de números de fibonacci que desea visualizar");
            dato = in.nextLine();
        } while (intentosRestantes > 0 && !esEntero(dato));
        if (intentosRestantes <= 0 || !esEntero(dato)) {
            System.out.println("Has sobrepasado el máximo de intentos erroneos permitidos");
        } else {
            for (int i = 1; i <= Integer.parseInt(dato); i++) {
                System.out.println(fibonacciIterativo(i));
            }
        }
        in.close();
    }

    /**
     * 47 en 26 segundos
     *
     * @param num
     * @return
     */
    public static int fibonacciRecursivo(int num) {
        switch (num) {
            case 1:
                return 0;
            case 2:
                return 1;
            default:
                return fibonacciRecursivo(num - 1) + fibonacciRecursivo(num - 2);
        }
    }

    /**
     * 47 en 0 segundos
     *
     * @param num
     * @return
     */
    public static int fibonacciArray(int num) {
        int array[] = new int[num];
        for (int i = 0; i < num; i++) {
            switch (i) {
                case 0:
                    array[i] = 0;
                    break;
                case 1:
                    array[i] = 1;
                    break;
                default:
                    array[i] = array[i - 1] + array[i - 2];
                    break;
            }
        }
        return array[num - 1];
    }

    /**
     * 47 en 0 segundos
     *
     * @param num
     * @return
     */
    public static int fibonacciIterativo(int num) {
        int numAux;
        int num1 = -1;
        int num2 = 1;
        for (int i = 0; i < num; i++) {
            numAux = num1;
            num1 = num2;
            num2 = numAux + num1;
        }
        return num2;
    }

    public static boolean esEntero(String dato) {
        try {
            Integer.parseInt(dato);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
