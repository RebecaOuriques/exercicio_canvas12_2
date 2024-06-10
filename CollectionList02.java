package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CollectionList02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int numero;
		numeros.addAll(Arrays.asList(2,5,1,3,4,9,7,8,10,6));
		
		System.out.println("Digite o número que deseja encontrar: ");
		numero = sc.nextInt();
		
		if(numeros.contains(numero)) {
			System.out.println("O número está na localizado na posição: " + numeros.indexOf(numero));
		} else {
			System.out.printf("O número %d não foi encontrado!", numero);
		}
		
		sc.close();
	}

}
