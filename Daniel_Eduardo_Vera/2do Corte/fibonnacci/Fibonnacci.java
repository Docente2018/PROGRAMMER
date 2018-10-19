package fibonnacci;

import java.util.Scanner;

class Fibonnacci {

    private static int num;
    private static int cont;
     public static void main(String[] args) {
     
         try {
        Scanner ingreso = new Scanner(System.in);
        
        int fiboNum1 = 1, fiboNum2 = 0, contador;
        do {
            System.out.print("Introduce numero mayor que 1: ");
            num = ingreso.nextInt();
        } while (num <= 1);
        System.out.println("Los " + num + " primeros numeros de Fibonacci son:");

        //System.out.print(fiboNum1 + " ");
        for (contador = 0; contador <= num; contador++) {
            System.out.print(fiboNum2 + " ");
            fiboNum2 = fiboNum1 + fiboNum2;
            fiboNum1 = fiboNum2 - fiboNum1;
        }
        System.out.println(); 
         }catch (Exception e){
             do{
             System.out.println("Error");
             
             }while(num>=3);
             System.out.println("Final");
             }
         }
    }
