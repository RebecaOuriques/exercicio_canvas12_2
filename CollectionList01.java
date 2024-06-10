package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CollectionList01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> cores =  new ArrayList<String> ();

		
		for ( int i = 0; i < 5; i++) {
		System.out.print("Digite uma cor: ");
		sc.skip("\\R?");
		cores.add(sc.next());
		}	
		
		System.out.println("\nListar todas as cores:\n");
		for (String cor1 : cores) {
			System.out.println(cor1);
		}
		
		System.out.println("\nOrdenar todas as cores:");
		
		Collections.sort(cores);
		for (String cor : cores) {
			System.out.print("\n" + cor);
		}
		
		sc.close();
	}

}
