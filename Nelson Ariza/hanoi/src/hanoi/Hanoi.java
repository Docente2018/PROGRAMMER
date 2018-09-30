package hanoi;

import java.util.Scanner;

public class Hanoi {
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		char com='A';
		char aux='B';
		char fin='C';
		int n;

		System.out.println("Número de discos: ");
		n= in.nextInt();

		System.out.println("Los movimientos a realizar son:");
		hanoi(n,com,aux,fin);
		in.close();
	}
	
	public static void hanoi(int n,int com, int aux, int fin) {
		if(n==1){
			System.out.println((char)com+"->"+(char)fin);
			}
			else{
			hanoi(n-1,com,fin,aux);
			System.out.println((char)com+"->"+(char)fin);
			hanoi(n-1,aux,com,fin);
			}
	}
}
