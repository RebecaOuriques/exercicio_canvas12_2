package main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CollectionSet01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> setNumeros =  new HashSet<Integer> ();
		
		System.out.println("Informe 10 números: \n");
		
		for (int i = 0; i < 10; i++) {
			System.out.printf("Informe o %d número: " , (i +1));
			setNumeros.add(sc.nextInt());
		}
	
		System.out.println("\nListar dados do Set: \n");
		/*for (Integer numero : setNumeros) {
		System.out.println(numero);
		}*/
		
		Iterator<Integer> isetNumeros  = setNumeros.iterator();
		
		while (isetNumeros.hasNext()) {
			System.out.println(isetNumeros.next());
		}
		
		sc.close();	
	}
}
