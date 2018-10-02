import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	private static Scanner sc;

	public static void main(String[] args) {
		int count = 0;
		sc = new Scanner(System.in);
		
		//Si hay 3 errores no deja digitar más
		while (count < 3) {
			try {
				
				//Pide el número limite para generar la serie de fibonacci
				System.out.println("Introduce el número de elementos a mostrar de la serie: ");
				int limite = sc.nextInt();
				// sc.close();
				//Valida si es un número negativo
				if (limite < 0) {
					System.out.println("No se admiten números negativos");
					count++;
				} else {
					//Llama al método recursivo para generar la serie fibonacci
					for (int i = 0; i < limite; i++) {
						System.out.print(funcionFibonacci(i) + ", ");
					}
				}
			} catch (InputMismatchException ime) {
				System.out.println("No puede ingresar letras " + ime);
				count++;
				sc.nextLine();
			} catch (Exception e) {
				System.out.println("Se ha presentado un error " + e);
				count++;
				sc.nextLine();
			}
		}
		
		if (count == 3) {
			System.out.println("Lo sentimos a excedido el número máximo de intentos");
		}

	}

	//Función para calcular la serie Fibonacci hasta determinado número
	private static int funcionFibonacci(int num) {
		if (num == 0 || num == 1)
			return num;
		else
			return funcionFibonacci(num - 1) + funcionFibonacci(num - 2);
	}
}
