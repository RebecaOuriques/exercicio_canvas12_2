package main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CollectionSet02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> setNumeros = new HashSet();
		int numero;
		
		setNumeros.addAll(Arrays.asList(2,5,1,3,4,9,7,8,10,6));
		System.out.println("\nDigite o número que deseja encontrar: ");
		numero = sc.nextInt();
		
		if (setNumeros.contains(numero)) {
			System.out.printf("\nNúmero %d foi encontrado!", numero);
		} else {
			System.out.printf("\nNúmero %d não foi encontrado!", numero);
		}
		
		
		sc.close();
		
	}

}
