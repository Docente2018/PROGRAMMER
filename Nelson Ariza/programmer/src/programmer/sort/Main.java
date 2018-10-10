package programmer.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		List<Integer> lista = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			lista.add(random.nextInt(50));
		} 
		
		List<Double> lista2 = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			lista2.add(random.nextDouble());
		} 
		
		List<String> lista3 = new ArrayList<>();;
		String arreglo[] = new String[]{"uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve","diez"};
		for (String palabra: arreglo) {
			lista3.add(palabra);
		} 
		List<Integer> lista4 = new ArrayList<>(lista);
		
		System.out.println("Bubble Sort");
		System.out.println(lista.toString());
		Sort bubbleSort = new BubbleSort();
		List<Integer> l1 = bubbleSort.sort(lista);
		System.out.println(l1.toString());
		System.out.println();
		
		System.out.println("Shell Sort");
		System.out.println(lista2.toString());
		Sort shellSort = new ShellSort();
		List<Double> l2 = shellSort.sort(lista2);
		System.out.println(l2.toString());
		System.out.println();
		
		System.out.println("Quick Sort");
		System.out.println(lista3.toString());
		Sort quickSort = new QuickSort();
		List<String> l3 = quickSort.sort(lista3);
		System.out.println(l3.toString());
		System.out.println();
		
		System.out.println("Merge Sort");
		System.out.println(lista4.toString());
		Sort mergeSort = new MergeSort();
		List<Integer> l4 = mergeSort.sort(lista4);
		System.out.println(l4.toString());
		System.out.println();
	}
}