package fibonacci;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int fin,num, n1, n2,temp,i = 0;
	        do {
		n1 = 0;
		n2 = 1;
		System.out.println(" _________________________________________________________________________");
		System.out.println(" Bienvenido este programa genera la serie de Fibonacci que desee consultar");
		System.out.println(" ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
		System.out.println("Digite un numero");
		num = read.nextInt();                
                do {                    
                    System.out.print(n2+" - ");
                    temp = n1+n2;
                    n1 = n2;
                    n2 = temp;
                    i++;
		} while(i!=num);
		System.out.println("\nPara finalizar presione 0\nPara continuar otro numero");
		fin = read.nextInt();
	} while (fin != 0);
    }    
}
